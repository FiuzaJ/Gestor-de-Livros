# Sistema de Gestão de Biblioteca

Este é o meu projeto para resolver o desafio da formação de Java da Rocketseat. O conceito desse pequeno sistema é apenas para que eu pudesse desenvolver mais meus conhecimentos adquiridos até aqui.

# Sobre o Gestor de Livros :

# Gerenciador de Livros
Lista todos os livros disponíveis: Irá exibir apenas os livros que estão disponiveis aquele momento.
Realizar empréstimo de um livro: Permite que um usuário escolha e pegue emprestado um livro.
# Estrutura do Projeto
O projeto é dividido nas seguintes classes principais:

Livro: Representa os livros na biblioteca, com atributos como id, titulo, autor, disponivel, dataCad e dataAtt.
Autor: Representa os autores dos livros, com atributos como id, nome, e dataNascimento.
Emprestimo: Gerencia os empréstimos de livros, com informações sobre o livro emprestado e datas de empréstimo e devolução.
Biblioteca: Gerencia a coleção de livros, autores e empréstimos.
# Ao Iniciar
O Gestor irá perguntar se você quer ver os livros disponiveis, se sim, irá apresentar os livros disponiveis por id, caso você escolha um livro o sistema irá perguntar o seu nome e após o nome digitado irá comunicar que o livro escolhido foi emprestado para o nome digitado.
