package org.patricbrc.Workspace;

import java.io.*;
import java.util.*;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.annotate.*;
import org.codehaus.jackson.type.*;
import org.codehaus.jackson.*;



@JsonSerialize(using = args_get_download_url_serializer.class)
@JsonDeserialize(using = args_get_download_url_deserializer.class)
public class args_get_download_url
{
    public get_download_url_params input;
}


