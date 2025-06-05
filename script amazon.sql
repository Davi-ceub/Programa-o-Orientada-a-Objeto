Alter table Compra
add constraint fk_idProduto foreign key(idProduto)
References Produto(idProduto);

Alter table Compra
add constraint fk_idCliente foreign key(idCliente)
references Cliente(idCliente);

insert into Produto(nome,preco)
values('Xbox one',3250.00),
('Ps5',4099.99),
('Televisão 4k',6000.00),
('Dicionário',50.00),
('Aspirador',125.99),
('Controle Remoto',19.99),
('Monitor',399.99);

insert into Cliente(nome,CartaoDeCredito)
values('José',5847560797341),
('Andrade',8395072648613),
('Pedro',0649572494624),
('Maria',2603857615079),
('Sofia',5174890265486),
('Davi',1038573957257),
('Roberto',3947582603851);

select * from Compra;