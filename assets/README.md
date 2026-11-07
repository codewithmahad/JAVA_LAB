# README artwork

Local artwork for the Java notebook: a compact title, the Java mark, an open, numbered compile-and-run sequence, and a closing illustration with small lab links. The original artwork has light and dark versions; the execution diagram also has a vertical layout for narrow screens.

| File | Source and purpose |
| :--- | :--- |
| `logos/java.svg` | Java mark from [Devicon](https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg), stored without modifications. Upstream blob: `051bf254ad782820627890ef2b0e06fbae63dc6e`. |
| `logos/java-site.svg` | The same mark with its colors adapted to the Java.com palette; the original geometry is retained. |
| `readme/java-title-*.svg` | Original title using Segoe UI Bold, converted to vector paths so it renders consistently without a font download. |
| `readme/java-execution*.svg` | Original execution sketch: source → class files → JVM, annotated with the lab's standard Maven source and output paths. |
| `readme/lab-notebook-*.svg` | Original open-notebook illustration for the closing section: code, revision notes, a bookmark, and a pencil. Its shape can be reused across learning labs, with accents adapted to each lab. |
| `readme/lab-{java,dsa,sql,linux}-{light,dark}.svg` | Compact links for the learning labs, following the small inline-button format used in my profile's typing section. Java uses the adapted Devicon mark; the tree, database, and terminal symbols are original. Labels use Segoe UI Semibold converted to paths. Linux has a smaller, neutral treatment as a coursework lab. |

The execution sketch follows the JDK 25 command references for [javac](https://docs.oracle.com/en/java/javase/25/docs/specs/man/javac.html) and [java](https://docs.oracle.com/en/java/javase/25/docs/specs/man/java.html), alongside Maven's [source layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html) and [compiler output](https://maven.apache.org/plugins/maven-compiler-plugin/compile-mojo.html#outputDirectory). It describes the explicit compile-and-run path and is a conceptual reference, not evidence of a recorded experiment.

Devicon's MIT notice is included in [logos/LICENSE-devicon.txt](logos/LICENSE-devicon.txt). Java and its mark belong to their respective owner; use here identifies the language.

The palette comes from [Java.com](https://www.java.com/en/): blue `#3A75B0` is its primary/header color in [jcom_redwood.css](https://www.java.com/jcom/assets/jcom_redwood.css); orange `#F29111` is the homepage heading accent. Neutral text and hairline dividers adapt to GitHub's light and dark backgrounds. The workflow has no filled panels.

The original SVGs include accessible titles and descriptions. They contain no scripts, embedded fonts, or external resources.
