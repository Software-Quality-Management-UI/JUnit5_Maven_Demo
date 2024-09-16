package is.hi.cs.junit5demo;

import org.junit.platform.suite.api.*;

@Suite
@SelectPackages("is.hi.cs") // All classes from this package and sub-packages
@IncludeClassNamePatterns(
    "^.*Test.*$") // Filter out those classes that do not match pattern. (Defaults is "^.*Tests?$"
// which matches against class names ending in "Test" or "Tests")
public
class AlltestsUsingSelectPackageAndFilter { // Class name uses by intention lower case "test" to
  // avoid being included by .*Test.* pattern!
  // the class remains completely empty,
  // being used only as a holder for the above annotations
}
