# TabAPI
An extremely simple tabapi for minecraft to enforce a tablist size
of 80 players, to get 1.7 clients to see 4 columns.

- You can use it for Hub Core, HCF Core and other things..
- This API is not 100% mine, I found it out there and fixed some things that didn't workThis API is not 100% mine, I found it out there and fixed some things that didn't work. 

# Features

- Support Spigot 1.7
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
