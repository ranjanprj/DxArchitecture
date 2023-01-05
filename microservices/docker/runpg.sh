docker run  --name mypgc -p 5432:5432 -e POSTGRES_PASSWORD=postgres --rm mypg
# docker run -it --name mypgc -p 5432:5432 -e POSTGRES_PASSWORD=postgres --rm mypg /bin/bash