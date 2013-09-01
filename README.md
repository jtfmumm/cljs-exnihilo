server.clj is fake!  So is client.cljs!  Edit or replace those babies...

# cljs-exnihilo

A Leiningen template based on cljs-kickoff by Konrad Garus.

## Usage

```bash
lein new cljs-exnihilo my-project
```

Up and running (with CLJS compilation):
```bash
cd my-project
lein ring server
```

Interactive developmnt:
```bash
# Shell 1 - start server:
cd my-project
lein ring server

# Shell 2 - cljsbuild will recompile cljs whenever the files change:
cd my-project
lein cljsbuild auto
```

## License

Copyright © 2013 John Mumm

Distributed under the Eclipse Public License.
