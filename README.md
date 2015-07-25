# cljs-exnihilo

A Lein template for ClojureScript projects.

## Usage

First add :

```
[leinjacker "0.4.1"]
```

to your profiles.clj file in your .lein directory(which is usually in your home directory). 

Now, navigate to the location where you want your project directory to go.  Then run:

```bash
lein deps
```

to grab the lein jacker dependencies.

Finally, create the new project with:

```bash
lein new cljs-exnihilo name-of-project
```

Now run cljsbuild to initially compile cljs files.  Leave this running in the background if you want to recompile the cljs files whenever you change them:

```bash
cd name-of-project
lein cljsbuild auto
```

In a separate terminal, navigate to your directory and start the ring server:

```bash
cd name-of-project
lein ring server
```

You are now ready to edit your project in LightTable, or whichever IDE you prefer.

## License

Copyright © 2013 John Mumm

Distributed under the Eclipse Public License.
