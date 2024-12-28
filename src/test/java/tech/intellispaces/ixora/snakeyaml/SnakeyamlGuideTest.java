package tech.intellispaces.ixora.snakeyaml;

import tech.intellispaces.ixora.data.association.YamlStringToDictionaryGuide;
import tech.intellispaces.ixora.data.test.dictionary.YamlStringToDictionaryGuideTest;

/**
 * Tests for {@link SnakeyamlGuide} class.
 */
public class SnakeyamlGuideTest extends YamlStringToDictionaryGuideTest {

  @Override
  public YamlStringToDictionaryGuide guide() {
    return new SnakeyamlGuide();
  }
}
