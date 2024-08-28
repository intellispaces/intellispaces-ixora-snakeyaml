package intellispaces.ixora.snakeyaml;

import intellispaces.ixora.structures.exception.InvalidPropertyException;
import intellispaces.ixora.structures.properties.Properties;
import intellispaces.ixora.structures.properties.YamlStringToPropertiesGuide;

import org.yaml.snakeyaml.Yaml;

import intellispaces.core.annotation.Guide;
import intellispaces.core.annotation.Mapper;
import intellispaces.ixora.structures.properties.MapBasedProperties;

@Guide
public class SnakeyamlGuide implements YamlStringToPropertiesGuide {

  @Mapper
  @Override
  public Properties yamlStringToProperties(String string) throws InvalidPropertyException {
    try {
      var yaml = new Yaml();
      return new MapBasedProperties(yaml.load(string));
    } catch (Exception e) {
      throw InvalidPropertyException.withCauseAndMessage(e, "Failed to read YAML string");
    }
  }
}
