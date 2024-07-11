package tech.intellispaces.ixora.snakeyaml;

import org.yaml.snakeyaml.Yaml;
import tech.intellispaces.framework.core.annotation.Guide;
import tech.intellispaces.framework.core.annotation.Mapper;
import tech.intellispaces.ixora.commons.structures.properties.MapBasedProperties;
import intellispaces.ixora.structures.exception.InvalidPropertyException;
import intellispaces.ixora.structures.properties.PropertiesHandle;
import intellispaces.ixora.structures.properties.YamlStringToPropertiesGuide;

@Guide
public class SnakeYamlStringToPropertiesGuide implements YamlStringToPropertiesGuide {

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
