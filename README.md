# Dotty Metaprogramming Examples
![CI](https://github.com/anatoliykmetyuk/dotty-macro-examples/workflows/CI/badge.svg)

This repo contains a bunch of examples of doing metaprogramming in Dotty.

Every folder is a separate example. Each example contains a README.md file with a description of what the example does.

To run an example:

1. Clone and `cd` into the repo repo using `git clone https://github.com/anatoliykmetyuk/dotty-macro-examples.git && cd dotty-macro-examples`
2. Use `./mill <example_name>.run` command to run the example you are interested in. E.g. `./mill macroTypeclassDerivation.run` runs `macroTypeclassDerivation` example.

## Examples
- `abstractTypeclassBody` – how to abstract a body of a function inside a macro-generated class into a separate macro.
- `accessMembersByName` – access an arbitrary member of a value given this member's name as a `String`.
- `defaultParamsInference` – given a case class with default parameters, obtain the values of these default parameters.
- `macroTypeclassDerivation` – typeclass construction done with TASTy Reflect.
