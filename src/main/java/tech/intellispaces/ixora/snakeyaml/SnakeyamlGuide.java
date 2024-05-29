package tech.intellispaces.ixora.snakeyaml;

import org.yaml.snakeyaml.Yaml;
import tech.intellispaces.ixora.commons.structures.properties.MapBasedPropertiesHandleImpl;
import tech.intellispaces.ixora.structures.properties.BytesToPropertiesTransition;
import tech.intellispaces.ixora.structures.properties.InvalidPropertyException;
import tech.intellispaces.ixora.structures.properties.PropertiesHandle;
import tech.intellispaces.ixora.structures.properties.StringToPropertiesTransition;
import tech.intellispacesframework.core.annotation.Mapper;
import tech.intellispacesframework.core.annotation.Unit;

import java.io.ByteArrayInputStream;

@Unit
public class SnakeyamlGuide implements StringToPropertiesTransition, BytesToPropertiesTransition {

  @Mapper
  @Override
  public PropertiesHandle stringToProperties(String string) throws InvalidPropertyException {
    try {
      var yaml = new Yaml();
      return new MapBasedPropertiesHandleImpl(yaml.load(string));
    } catch (Exception e) {
      throw InvalidPropertyException.withCauseAndMessage(e, "Failed to read YAML");
    }
  }

  @Mapper
  @Override
  public PropertiesHandle bytesToProperties(byte[] bytes) throws InvalidPropertyException {
    try {
      var yaml = new Yaml();
      return new MapBasedPropertiesHandleImpl(yaml.load(new ByteArrayInputStream(bytes)));
    } catch (Exception e) {
      throw InvalidPropertyException.withCauseAndMessage(e, "Failed to read YAML");
    }
  }
}
