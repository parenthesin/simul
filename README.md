# simul

GraphQL BFF for our live demo Web App
> Simul. Simultaneously; at the same time.

## Setup

Based on config.clj.sample file create your own config.edn, you will need all Api Keys listed inside the sample file for this step.
```bash
$ cp resources/config.edn.sample resources/config.edn
```

Or you can set all keys in as environment variables.
```bash
$ UNSPLASH_ACCESS_KEY="YOUR-UNSPLASH-ACCESS-KEY-IN-EV" lein repl
```

## Usage
For development with auto-reload namespaces: 
```bash
$ lein run-dev
```

For production like just run:
```bash
$ lein run
```

## License

Copyright © 2019 Parenthensin

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
