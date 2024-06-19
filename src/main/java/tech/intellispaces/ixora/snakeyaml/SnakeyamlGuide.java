package tech.intellispaces.ixora.snakeyaml;

import org.yaml.snakeyaml.Yaml;
import tech.intellispaces.framework.core.annotation.Guide;
import tech.intellispaces.ixora.commons.structures.properties.MapBasedPropertiesHandleImpl;
import tech.intellispaces.ixora.structures.properties.InvalidPropertyException;
import tech.intellispaces.ixora.structures.properties.PropertiesHandle;
import tech.intellispaces.framework.core.annotation.Mapper;
import tech.intellispaces.ixora.structures.properties.YamlBytesToPropertiesTransition;
import tech.intellispaces.ixora.structures.properties.YamlStringToPropertiesTransition;

import java.io.ByteArrayInputStream;

@Guide
public class SnakeyamlGuide implements YamlStringToPropertiesTransition, YamlBytesToPropertiesTransition {

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

  @Mapper
  @Override
  public PropertiesHandle yamlBytesToProperties(byte[] bytes) throws InvalidPropertyException {
    try {
      var yaml = new Yaml();
      return new MapBasedPropertiesHandleImpl(yaml.load(new ByteArrayInputStream(bytes)));
    } catch (Exception e) {
      throw InvalidPropertyException.withCauseAndMessage(e, "Failed to load YAML");
    }
  }
}
