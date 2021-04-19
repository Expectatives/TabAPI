# TabAPI
An extremely simple tabapi for minecraft to enforce a tablist size
of 80 players, to get 1.7 clients to see 4 columns.

- You can use it for Hub Core, HCF Core and other things..
- This API is a fork solving some things.

# Features

- Support 1.7 - 1.8
- Custom TAB

# Usage
Usage The usage is very easy - here's an example:
 ## Registering the handler itself:
```sh
@SuppressWarnings("deprecation")
public void onEnable() {
    new TablistManager(this, new TablistAdapter(), 500L);
}
```
