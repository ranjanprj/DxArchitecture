FROM postgres:15 as basepg

ENV POSTGRES_PASSWORD docker
ENV POSTGRES_DB world
COPY init.sql /docker-entrypoint-initdb.d/

RUN apt-get update && apt-get install -y  wget \
                       build-essential \
                       postgresql-server-dev-15 \
                       postgresql-plpython3-15 \
                       postgresql-contrib-15 \
                       openssl \
                       libssl-dev \
                       libboost-all-dev \
                       m4 \
                       wget \
                       vim \
                       pgxnclient \
                       flex \
                       bison \
                       graphviz \
                       pgxnclient \
                       cmake \
                       g++ \
                       python-is-python3 \
                       software-properties-common \ 
                       python3-pip


FROM basepg as pythonpg
RUN pip install requests matplotlib seaborn numpy pandas numba 

FROM pythonpg