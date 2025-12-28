<<<<<<< HEAD
package br.com.alura.screenmatch.service;

import tools.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        return mapper.readValue(json,classe);

        }

}
=======
package br.com.alura.screenmatch.service;

import tools.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        return mapper.readValue(json,classe);

        }

}
>>>>>>> b6f17c5e04ef4af1b4bae388635e6f439c63d286
