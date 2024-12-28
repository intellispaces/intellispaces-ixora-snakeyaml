package tech.intellispaces.ixora.snakeyaml;

import org.yaml.snakeyaml.Yaml;
import tech.intellispaces.ixora.data.association.Dictionaries;
import tech.intellispaces.ixora.data.association.Dictionary;
import tech.intellispaces.ixora.data.association.YamlStringToDictionaryGuide;
import tech.intellispaces.ixora.data.exception.InvalidPropertyException;
import tech.intellispaces.ixora.data.exception.InvalidPropertyExceptions;
import tech.intellispaces.jaquarius.annotation.Guide;
import tech.intellispaces.jaquarius.annotation.Mapper;

@Guide
public class SnakeyamlGuide implements YamlStringToDictionaryGuide {

  @Mapper
  @Override
  public Dictionary yamlStringToDictionary(String string) throws InvalidPropertyException {
    try {
      var yaml = new Yaml();
      return Dictionaries.of(yaml.load(string));
    } catch (Exception e) {
      throw InvalidPropertyExceptions.withCauseAndMessage(e, "Failed to read YAML string");
    }
  }
}
