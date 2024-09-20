package intellispaces.ixora.snakeyaml;

import intellispaces.ixora.structures.association.Properties;
import intellispaces.ixora.structures.association.Propertieses;
import intellispaces.ixora.structures.association.YamlStringToPropertiesGuide;
import intellispaces.ixora.structures.exception.InvalidPropertyException;

import org.yaml.snakeyaml.Yaml;

import intellispaces.framework.core.annotation.Guide;
import intellispaces.framework.core.annotation.Mapper;

@Guide
public class SnakeyamlGuide implements YamlStringToPropertiesGuide {

  @Mapper
  @Override
  public Properties yamlStringToProperties(String string) throws InvalidPropertyException {
    try {
      var yaml = new Yaml();
      return Propertieses.of(yaml.load(string));
    } catch (Exception e) {
      throw InvalidPropertyException.withCauseAndMessage(e, "Failed to read YAML string");
    }
  }
}
