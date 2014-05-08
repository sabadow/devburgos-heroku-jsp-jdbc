devburgos-heroku-jsp-jdbc
=========================

##Clone on local directory
```
git clone https://github.com/sabadow/devburgos-heroku-jsp-jdbc.git
```

##Deploy on heroku
setup the CLI tools
```
heroku login
```

create an empty app
```
heroku create
```

upload the code to heroku
```
git push heroku
```

see the result
```
heroku open
```

##Test on local
create a .env file (**don´t add to repository!!**) with the content
```
export DATABASE_URL=postgres://<username>:<password>@<host>/<dbname>
```

compile the app
```
mvn clean package
```

run on local with foreman
```
foreman start
```
