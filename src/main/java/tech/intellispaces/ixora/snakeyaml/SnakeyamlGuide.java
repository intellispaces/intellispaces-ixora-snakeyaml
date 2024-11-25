package tech.intellispaces.ixora.snakeyaml;

import org.yaml.snakeyaml.Yaml;
import tech.intellispaces.ixora.data.association.Properties;
import tech.intellispaces.ixora.data.association.Propertieses;
import tech.intellispaces.ixora.data.association.YamlStringToPropertiesGuide;
import tech.intellispaces.ixora.data.exception.InvalidPropertyException;
import tech.intellispaces.ixora.data.exception.InvalidPropertyExceptions;
import tech.intellispaces.jaquarius.annotation.Guide;
import tech.intellispaces.jaquarius.annotation.Mapper;

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
