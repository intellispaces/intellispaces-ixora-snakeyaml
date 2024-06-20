package tech.intellispaces.ixora.snakeyaml;

import tech.intellispaces.ixora.structures.properties.YamlStringToPropertiesTransition;
import tech.intellispaces.ixora.structures.properties.YamlStringToPropertiesTransitionTest;

/**
 * Tests for {@link SnakeyamlGuide} class.
 */
public class SnakeyamlGuideTest implements YamlStringToPropertiesTransitionTest {

  @Override
  public YamlStringToPropertiesTransition guide() {
    return new SnakeyamlGuide();
  }
}
