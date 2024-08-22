package intellispaces.ixora.snakeyaml;

import intellispaces.ixora.structures.properties.YamlStringToPropertiesMapper;

import intellispaces.ixora.test.structures.properties.YamlStringToPropertiesMapperTest;

/**
 * Tests for {@link YamlStringToPropertiesSnakeyamlMapper} class.
 */
public class YamlStringToPropertiesSnakeyamlMapperTest extends YamlStringToPropertiesMapperTest {

  @Override
  public YamlStringToPropertiesMapper guide() {
    return new YamlStringToPropertiesSnakeyamlMapper();
  }
}
