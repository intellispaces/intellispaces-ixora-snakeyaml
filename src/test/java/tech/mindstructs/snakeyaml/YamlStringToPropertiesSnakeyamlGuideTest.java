package tech.mindstructs.snakeyaml;

import intellispaces.ixora.mindstructs.structures.properties.YamlStringToPropertiesGuide;

import tech.mindstructs.test.structures.properties.YamlStringToPropertiesGuideTest;

/**
 * Tests for {@link YamlStringToPropertiesSnakeyamlGuide} class.
 */
public class YamlStringToPropertiesSnakeyamlGuideTest extends YamlStringToPropertiesGuideTest {

  @Override
  public YamlStringToPropertiesGuide guide() {
    return new YamlStringToPropertiesSnakeyamlGuide();
  }
}
