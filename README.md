# TabAPI
An extremely simple bukkit plugin for minecraft to enforce a tablist size
of 80 players, to get 1.7 clients to see 4 columns.

# Features

- Support 1.7 - 1.8
- Custom TAB

# Usage
Usage The usage is very easy - here's an example:
 ## Registering the handler itself:
```sh
@SuppressWarnings("deprecation")
	public void onEnable(){
		new TablistManager(this, new TablistAdapter(), 500L);
	}
```
