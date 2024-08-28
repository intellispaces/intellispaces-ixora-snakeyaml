package intellispaces.ixora.snakeyaml;

import intellispaces.ixora.structures.properties.YamlStringToPropertiesGuide;

import intellispaces.ixora.test.structures.properties.YamlStringToPropertiesGuideTest;

/**
 * Tests for {@link SnakeyamlGuide} class.
 */
public class SnakeyamlGuideTest extends YamlStringToPropertiesGuideTest {

  @Override
  public YamlStringToPropertiesGuide guide() {
    return new SnakeyamlGuide();
  }
}
