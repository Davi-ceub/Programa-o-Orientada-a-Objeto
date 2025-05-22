select * from Autor;

insert into Autor(idAutor,Nome)
Values(1,'JK Rowling'),
(2,'Machado de Assis'),
(3,'Camões'),
(4,'RL Stine'),
(5,'Stephen King');


alter table Livro
add constraint fk_idAutor foreign key(idAutor)
references Autor(idAutor);


select * from Livro;