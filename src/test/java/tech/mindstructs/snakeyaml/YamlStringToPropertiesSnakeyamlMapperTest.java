package tech.mindstructs.snakeyaml;

import intellispaces.ixora.mindstructs.structures.properties.YamlStringToPropertiesMapper;

import tech.mindstructs.test.structures.properties.YamlStringToPropertiesMapperTest;

/**
 * Tests for {@link YamlStringToPropertiesSnakeyamlMapper} class.
 */
public class YamlStringToPropertiesSnakeyamlMapperTest extends YamlStringToPropertiesMapperTest {

  @Override
  public YamlStringToPropertiesMapper guide() {
    return new YamlStringToPropertiesSnakeyamlMapper();
  }
}
