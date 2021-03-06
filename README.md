# lein-hello

A [Leiningen](http://github.com/technomancy/leiningen) plugin that displays a friendly greeting!

## Usage

After installation (see below), execute the following for usage / documenation:

    lein help hello

An example project (consisting of only a project file) is located under `example/`.

## Installation

This plugin is not deloyed to Clojars. Therefore, run `lein install` to ensure it is in your local repository before attempting to use it.

For user-level plugins put `[lein-hello "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your `:user` profile, or if you are on Leiningen 1.x do `lein plugin install
lein-hello 0.1.0-SNAPSHOT`.

For project-level plugins: put `[lein-hello "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

## Continuous Integration

[![Build Status](https://travis-ci.org/noahlz/lein-hello.png?branch=master)](https://travis-ci.org/noahlz/lein-hello)

CI is hosted by [travis-ci.org](http://travis-ci.org)

## License

Copyright © 2013 Noah Zucker (@noahlz / nzucker AT gmail DOT com) 

Distributed under the Eclipse Public License, the same as Clojure.
