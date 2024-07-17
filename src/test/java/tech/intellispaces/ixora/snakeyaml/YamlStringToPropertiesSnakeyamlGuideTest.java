package tech.intellispaces.ixora.snakeyaml;

import intellispaces.ixora.structures.properties.YamlStringToPropertiesGuide;
import tech.intellispaces.ixora.structures.properties.YamlStringToPropertiesGuideTest;

/**
 * Tests for {@link YamlStringToPropertiesSnakeyamlGuide} class.
 */
public class YamlStringToPropertiesSnakeyamlGuideTest extends YamlStringToPropertiesGuideTest {

  @Override
  public YamlStringToPropertiesGuide guide() {
    return new YamlStringToPropertiesSnakeyamlGuide();
  }
}
