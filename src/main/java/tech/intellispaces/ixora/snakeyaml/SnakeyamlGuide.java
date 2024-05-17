package tech.intellispaces.ixora.snakeyaml;

import intellispaces.ixora.structures.properties.InvalidPropertyException;
import intellispaces.ixora.structures.properties.Properties;
import org.yaml.snakeyaml.Yaml;
import tech.intellispacesframework.core.annotation.Mapper;
import tech.intellispacesframework.core.annotation.Unit;

import java.io.ByteArrayInputStream;

@Unit
public class SnakeyamlGuide implements StringToPropertiesTransition, BytesToPropertiesTransition {

  @Mapper
  @Override
  public Properties stringToProperties(String string) throws InvalidPropertyException {
    try {
      var yaml = new Yaml();
      return new MapBasedPropertiesImpl(yaml.load(string));
    } catch (Exception e) {
      throw InvalidPropertyException.withCauseAndMessage(e, "Failed to load YAML");
    }
  }

  @Mapper
  @Override
  public Properties bytesToProperties(byte[] bytes) throws InvalidPropertyException {
    try {
      var yaml = new Yaml();
      return new MapBasedPropertiesImpl(yaml.load(new ByteArrayInputStream(bytes)));
    } catch (Exception e) {
      throw InvalidPropertyException.withCauseAndMessage(e, "Failed to load YAML");
    }
  }
}
