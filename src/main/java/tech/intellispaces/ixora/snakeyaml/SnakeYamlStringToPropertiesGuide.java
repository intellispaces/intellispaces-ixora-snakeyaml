package tech.intellispaces.ixora.snakeyaml;

import org.yaml.snakeyaml.Yaml;
import tech.intellispaces.framework.core.annotation.Guide;
import tech.intellispaces.framework.core.annotation.Mapper;
import tech.intellispaces.ixora.commons.structures.properties.MapBasedPropertiesHandleImpl;
import tech.intellispaces.ixora.structures.exception.InvalidPropertyException;
import tech.intellispaces.ixora.structures.properties.PropertiesHandle;
import tech.intellispaces.ixora.structures.properties.YamlStringToPropertiesGuide;

@Guide
public class SnakeYamlStringToPropertiesGuide implements YamlStringToPropertiesGuide {

  @Mapper
  @Override
  public PropertiesHandle yamlStringToProperties(String string) throws InvalidPropertyException {
    try {
      var yaml = new Yaml();
      return new MapBasedPropertiesHandleImpl(yaml.load(string));
    } catch (Exception e) {
      throw InvalidPropertyException.withCauseAndMessage(e, "Failed to load YAML");
    }
  }
}
