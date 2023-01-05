create extension plpython3u;


CREATE FUNCTION testpy()
RETURNS text AS
$$
import sys
return sys.version
$$ LANGUAGE plpython3u;