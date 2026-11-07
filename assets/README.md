# README artwork

Local artwork for the Java notebook: a copper-and-charcoal title, the familiar Java mark, and an execution sketch. The title and diagram have light and dark versions; the diagram also has a vertical layout for narrow screens.

| File | Source and purpose |
| :--- | :--- |
| `logos/java.svg` | Java mark from [Devicon](https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg), stored without modifications. Upstream blob: `051bf254ad782820627890ef2b0e06fbae63dc6e`. |
| `readme/java-title-*.svg` | Original title using Segoe UI Bold, converted to vector paths so it renders consistently without a font download. |
| `readme/java-execution*.svg` | Original execution sketch: source → class files → JVM, annotated with the lab's standard Maven source and output paths. |

The execution sketch follows the JDK 25 command references for [javac](https://docs.oracle.com/en/java/javase/25/docs/specs/man/javac.html) and [java](https://docs.oracle.com/en/java/javase/25/docs/specs/man/java.html), alongside Maven's [source layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html) and [compiler output](https://maven.apache.org/plugins/maven-compiler-plugin/compile-mojo.html#outputDirectory). It describes the explicit compile-and-run path and is a conceptual reference, not evidence of a recorded experiment.

Devicon's MIT notice is included in [logos/LICENSE-devicon.txt](logos/LICENSE-devicon.txt). Java and its mark belong to their respective owner; use here identifies the language.

The palette follows the diagram's stages: copper and warm cream for source, blue for bytecode, and neutral ink for the runtime. Dark variants use lighter text and deeper backgrounds.

The original SVGs include accessible titles and descriptions. They contain no scripts, embedded fonts, or external resources.
