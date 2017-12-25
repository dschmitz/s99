addSbtPlugin("com.dwijnand"      % "sbt-travisci"    % "1.1.1")
addSbtPlugin("com.lucidchart"    % "sbt-scalafmt"    % "1.14")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"         % "0.9.3")
addSbtPlugin("de.heikoseeberger" % "sbt-header"      % "4.0.0")
addSbtPlugin("org.wartremover"   % "sbt-wartremover" % "2.2.1")
addSbtPlugin("org.scalastyle"    %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("org.scoverage"     % "sbt-scoverage"          % "1.5.1")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25" // Needed by sbt-git
