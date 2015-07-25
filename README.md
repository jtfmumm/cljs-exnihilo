# cljs-exnihilo

A Lein template for ClojureScript projects.

## Usage

### Dependencies

You will need lein 2.0+.  See [here](https://github.com/technomancy/leiningen/blob/stable/README.md) for installation instructions.

You will need leinjacker, so make sure you have at least the following :

```
{:user {:plugins [[leinjacker "0.4.1"]] }} 
```

in the profiles.clj file in your .lein directory (which is usually in your home directory). 

Once you've created your project directory as detailed below, you may need to navigate to that directory and run :

```bash
lein deps
```

to grab the leinjacker dependencies.

### Creating a New Project
In order to create a new project (and an associated directory with the same name), run :

```bash
lein new cljs-exnihilo name-of-project
```

Now run cljsbuild to initially compile cljs files.  

Leave this running in the background if you want to recompile the cljs files whenever you change them:

```bash
cd name-of-project
lein cljsbuild auto
```

In a separate terminal, navigate to your directory and start the ring server:

```bash
cd name-of-project
lein ring server
```

You are now ready to edit your project.

## License

Copyright © 2013 John Mumm

Distributed under the Eclipse Public License.
