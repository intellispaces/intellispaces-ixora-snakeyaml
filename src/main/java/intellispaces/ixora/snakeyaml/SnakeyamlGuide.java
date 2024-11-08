package intellispaces.ixora.snakeyaml;

import intellispaces.ixora.data.association.Properties;
import intellispaces.ixora.data.association.Propertieses;
import intellispaces.ixora.data.association.YamlStringToPropertiesGuide;
import intellispaces.ixora.data.exception.InvalidPropertyException;

import intellispaces.ixora.data.exception.InvalidPropertyExceptions;
import org.yaml.snakeyaml.Yaml;

import intellispaces.jaquarius.annotation.Guide;
import intellispaces.jaquarius.annotation.Mapper;

@Guide
public class SnakeyamlGuide implements YamlStringToPropertiesGuide {

  @Mapper
  @Override
  public Properties yamlStringToProperties(String string) throws InvalidPropertyException {
    try {
      var yaml = new Yaml();
      return Propertieses.of(yaml.load(string));
    } catch (Exception e) {
      throw InvalidPropertyExceptions.withCauseAndMessage(e, "Failed to read YAML string");
    }
  }
}
