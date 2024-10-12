package intellispaces.ixora.snakeyaml;

import intellispaces.ixora.data.association.YamlStringToPropertiesGuide;
import intellispaces.ixora.data.test.properties.YamlStringToPropertiesGuideTest;

/**
 * Tests for {@link SnakeyamlGuide} class.
 */
public class SnakeyamlGuideTest extends YamlStringToPropertiesGuideTest {

  @Override
  public YamlStringToPropertiesGuide guide() {
    return new SnakeyamlGuide();
  }
}
