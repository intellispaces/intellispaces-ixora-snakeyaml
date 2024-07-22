package tech.mindstructs.snakeyaml;

import intellispaces.ixora.mindstructs.structures.exception.InvalidPropertyException;
import intellispaces.ixora.mindstructs.structures.properties.PropertiesHandle;
import intellispaces.ixora.mindstructs.structures.properties.YamlStringToPropertiesGuide;

import org.yaml.snakeyaml.Yaml;

import tech.intellispaces.framework.core.annotation.Guide;
import tech.intellispaces.framework.core.annotation.Mapper;
import tech.mindstructs.structures.properties.MapBasedProperties;

@Guide
public class YamlStringToPropertiesSnakeyamlGuide implements YamlStringToPropertiesGuide {

  @Mapper
  @Override
  public PropertiesHandle yamlStringToProperties(String string) throws InvalidPropertyException {
    try {
      var yaml = new Yaml();
      return new MapBasedProperties(yaml.load(string));
    } catch (Exception e) {
      throw InvalidPropertyException.withCauseAndMessage(e, "Failed to load YAML");
    }
  }
}
