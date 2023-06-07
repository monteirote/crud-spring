package com.vinicius.crudspring.exception;

    public class RecordNotFoundException extends RuntimeException {

        public RecordNotFoundException(Long id) {
            super("Curso não encontrado com o registro: " + id);
        }
    }
