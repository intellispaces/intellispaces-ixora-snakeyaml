package tech.intellispaces.ixora.snakeyaml;

import org.junit.jupiter.api.Test;
import tech.intellispaces.ixora.structures.properties.YamlStringToPropertiesTransitionTest;

/**
 * Tests for {@link SnakeyamlGuide} class.
 */
public class SnakeyamlGuideTest {

  @Test
  public void testYamlStringToProperties() {
    SnakeyamlGuide guide = new SnakeyamlGuide();
    YamlStringToPropertiesTransitionTest.allTests(guide);
  }
}
