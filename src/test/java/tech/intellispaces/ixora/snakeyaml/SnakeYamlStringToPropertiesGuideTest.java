package tech.intellispaces.ixora.snakeyaml;

import intellispaces.ixora.structures.properties.YamlStringToPropertiesGuide;
import tech.intellispaces.ixora.structures.properties.YamlStringToPropertiesGuideTest;

/**
 * Tests for {@link SnakeYamlStringToPropertiesGuide} class.
 */
public class SnakeYamlStringToPropertiesGuideTest extends YamlStringToPropertiesGuideTest {

  @Override
  public YamlStringToPropertiesGuide guide() {
    return new SnakeYamlStringToPropertiesGuide();
  }
}
