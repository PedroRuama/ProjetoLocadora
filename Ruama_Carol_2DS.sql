-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13-Dez-2022 às 19:42
-- Versão do servidor: 10.4.11-MariaDB
-- versão do PHP: 7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `ruama_carol_2ds`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE `categoria` (
  `cod` int(11) NOT NULL,
  `cate` varchar(20) DEFAULT NULL,
  `valor_km` decimal(8,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `categoria`
--

INSERT INTO `categoria` (`cod`, `cate`, `valor_km`) VALUES
(1, 'Basico', '0.49'),
(2, 'Utilitario', '0.51'),
(3, 'Luxo', '0.53'),
(4, 'Especial', '0.55');

-- --------------------------------------------------------

--
-- Estrutura da tabela `client`
--

CREATE TABLE `client` (
  `cpf` int(9) NOT NULL,
  `nome` varchar(40) DEFAULT NULL,
  `ende` varchar(60) DEFAULT NULL,
  `tel` varchar(15) DEFAULT NULL,
  `cidade` varchar(60) DEFAULT NULL,
  `data_nasc` date DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `client`
--

INSERT INTO `client` (`cpf`, `nome`, `ende`, `tel`, `cidade`, `data_nasc`, `sexo`) VALUES
(123456780, 'Ana Maria Gomes', 'Av. Fco. Glicério - 1240 - Ap.13', '19991233322', 'Campinas', '1970-12-08', 'F'),
(123456781, 'Paulo José Soares', 'R. 23 de Maio - 805', '11991223456', 'São Paulo', '1984-11-10', 'M'),
(123456789, 'José da Silva', 'R. da Boa Morte - 123', '19991234567', 'Piracicaba', '1955-01-13', 'M'),
(123456798, 'Jaqueline Fonseca', 'R. XV de Novembro', '19994101234', 'Valinhos', '1968-11-20', 'F'),
(123456799, 'Antônio Carlos Sobrinho', 'R. Suaçuna - 13', '19999101234', 'Campinas', '1970-09-11', 'M'),
(123549800, 'Maria Antônia Rodrigues', 'Av. da Saudade - 1280', '19991235567', 'Campinas', '1974-08-07', 'F'),
(123764598, 'Roberta de Sá', 'R. 13 de Maio-899', '19991230800', 'Campinas', '1952-10-09', 'F'),
(123765345, 'Pedro Santos', 'R. Perdidos', '19933422512', 'Campinas', '1923-12-01', 'M'),
(129345678, 'Marcelo Nogueira', 'Av. Moraes Sales - 1027', '19991244488', 'Campinas', '1968-03-28', 'M'),
(129778946, 'Paulo Albuquerque', 'R. da Candelária - 1390', '11992246699', 'São Paulo', '1981-02-25', 'M');

-- --------------------------------------------------------

--
-- Estrutura da tabela `combustivel`
--

CREATE TABLE `combustivel` (
  `tipo` char(1) NOT NULL,
  `combust` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `combustivel`
--

INSERT INTO `combustivel` (`tipo`, `combust`) VALUES
('A', 'Alcool'),
('D', 'Diesel'),
('F', 'Flex'),
('G', 'Gasolina');

-- --------------------------------------------------------

--
-- Estrutura da tabela `departamento`
--

CREATE TABLE `departamento` (
  `cod` int(11) NOT NULL,
  `depto` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `departamento`
--

INSERT INTO `departamento` (`cod`, `depto`) VALUES
(1, 'Atendimento'),
(2, 'Administrativo'),
(3, 'Financeiro'),
(4, 'Diretoria'),
(5, 'Copa');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `matricula` int(4) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `depto` int(1) DEFAULT NULL,
  `salario` decimal(8,2) DEFAULT NULL,
  `admissao` date DEFAULT NULL,
  `filho` int(1) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `ativo` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`matricula`, `nome`, `depto`, `salario`, `admissao`, `filho`, `sexo`, `ativo`) VALUES
(1001, 'Francisco de Oliveira', 1, '1800.00', '2001-11-20', 0, 'M', 1),
(1002, 'Ana Maria Andrade', 2, '3200.00', '1999-02-13', 1, 'F', 1),
(1003, 'Antônio Andrade de Oliveira', 3, '4800.00', '2007-11-05', 3, 'M', 1),
(1004, 'Maria Abelarda da Silva', 5, '937.00', '1997-03-01', 5, 'F', 1),
(1005, 'Manoel Trindade', 4, '7850.50', '1997-01-02', 3, 'M', 1),
(1006, 'Alexandre Barbosa', 1, '1800.00', '2000-06-08', 2, 'M', 1),
(1007, 'Rosana Campoy', 2, '3020.00', '2004-07-24', 3, 'F', 1),
(1008, 'Janaína Albuquerque', 3, '4500.00', '1999-03-25', 0, 'F', 1),
(1009, 'Roberto Silva Junior', 1, '1810.00', '2003-07-07', 0, 'M', 1),
(1010, 'Carlos Eduardo Siqueira', 4, '7890.00', '2009-08-04', 1, 'M', 1),
(1011, 'Heitor Sampaio', 1, '3450.00', '2011-03-05', 1, 'M', 1),
(1012, 'Célia Menezes', 1, '1980.00', '2008-07-18', 0, 'F', 1),
(1013, 'José Alves Costa', 1, '1650.00', '2000-09-11', 1, 'M', 1),
(1014, 'Arlinda Medeiros', 5, '937.00', '2000-05-03', 5, 'F', 1),
(1015, 'Josefina Sarmento', 4, '6789.00', '1997-01-02', 1, 'F', 1),
(1016, 'Wendell Navarro Perez', 3, '1212.00', '2004-04-15', 2, 'M', 1),
(1017, 'Rodolfo Rodrigues', 1, '8500.00', '2022-09-10', 2, 'M', 1),
(4353, 'aaaaaaa', 1, '1000.00', '2012-02-02', 1, 'F', NULL);

--
-- Acionadores `funcionario`
--
DELIMITER $$
CREATE TRIGGER `tr_AddUser_up` AFTER UPDATE ON `funcionario` FOR EACH ROW insert into usuario VALUES(new.matricula, new.admissao, new.matricula, new.depto, 1)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `tr_addUser` AFTER INSERT ON `funcionario` FOR EACH ROW INSERT INTO usuario VALUES(
new.matricula,
new.admissao,
new.matricula,
new.depto,
1)
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `os`
--

CREATE TABLE `os` (
  `num_os` int(11) NOT NULL,
  `mat_funcio` int(4) NOT NULL,
  `cpf_client` int(9) NOT NULL,
  `placa_veiculo` char(7) NOT NULL,
  `data_retirada` date NOT NULL,
  `data_devolucao` date DEFAULT NULL,
  `km_retirada` decimal(8,2) NOT NULL,
  `km_devolucao` decimal(8,2) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `valor_total` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `os`
--

INSERT INTO `os` (`num_os`, `mat_funcio`, `cpf_client`, `placa_veiculo`, `data_retirada`, `data_devolucao`, `km_retirada`, `km_devolucao`, `status`, `valor_total`) VALUES
(1, 1001, 123456780, 'AWV1234', '2021-01-03', '2021-01-25', '1800.59', '201289.00', 1, NULL),
(2, 1011, 123456798, 'AWV1323', '2021-01-03', '2021-01-13', '10000.00', '15000.00', 1, NULL),
(3, 1009, 123456799, 'ADX1473', '2021-01-10', NULL, '8528.00', '9002.00', 1, '0.00'),
(4, 1006, 123456789, 'AQW1234', '2021-02-02', NULL, '10000.00', '1234.00', 1, '0.00'),
(5, 1012, 123549800, 'AZX3273', '2021-01-02', NULL, '34580.00', '39508.00', 1, '0.00'),
(7, 1006, 129345678, 'AWS2365', '2021-01-06', NULL, '4058.23', '4555.55', 1, '0.00'),
(8, 1012, 128799480, 'AQX3451', '2021-01-01', NULL, '60038.00', '620015.00', 1, '0.00'),
(9, 1012, 123764598, 'ADE3456', '2021-01-01', NULL, '12058.00', '19000.00', 1, '0.00'),
(10, 1013, 123456781, 'ACZ3243', '2021-05-01', NULL, '10000.00', '13580.00', 1, '0.00'),
(11, 1001, 123456780, 'ABW4007', '2022-08-02', NULL, '3500.00', '3900.00', 1, '0.00');

--
-- Acionadores `os`
--
DELIMITER $$
CREATE TRIGGER `tr_disponivel` BEFORE UPDATE ON `os` FOR EACH ROW BEGIN
	if(new.data_devolucao is NOT null) then
		UPDATE veiculos set status_alocado = 0 WHERE veiculos.placa = new.placa_veiculo;
	END IF;
end
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `tr_locacao` AFTER INSERT ON `os` FOR EACH ROW UPDATE veiculos set status_alocado = "1" WHERE veiculos.placa = new.placa_veiculo
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `tr_valor` BEFORE UPDATE ON `os` FOR EACH ROW BEGIN
set @id_cat := (SELECT cat FROM veiculos WHERE placa = new.placa_veiculo);
set @valor_km := (SELECT valor_km from categoria WHERE cod = @id_cat);
set @km_rodado := new.km_devolucao - new.km_retirada;
set new.valor_total = @km_rodado * @valor_final;
end
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `login` int(11) NOT NULL,
  `senha` varchar(8) NOT NULL,
  `mat_func` int(4) DEFAULT NULL,
  `setor` int(11) NOT NULL,
  `status` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`login`, `senha`, `mat_func`, `setor`, `status`) VALUES
(1001, '2001-11-', 1001, 1, 1),
(1002, '1999-02-', 1002, 2, 1),
(1003, '2007-11-', 1003, 3, 1),
(1004, '1997-03-', 1004, 5, 1),
(1005, '1997-01-', 1005, 4, 1),
(1006, '2000-06-', 1006, 1, 1),
(1007, '2004-07-', 1007, 2, 1),
(1008, '1999-03-', 1008, 3, 1),
(1009, '2003-07-', 1009, 1, 1),
(1010, '2009-08-', 1010, 4, 1),
(1011, '2011-03-', 1011, 1, 1),
(1012, '2008-07-', 1012, 1, 1),
(1013, '2000-09-', 1013, 1, 1),
(1014, '2000-05-', 1014, 5, 1),
(1015, '1997-01-', 1015, 4, 1),
(1016, '2004-04-', 1016, 3, 1),
(1017, '2022-09-', 1017, 1, 1),
(4353, '2012-02-', 4353, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculos`
--

CREATE TABLE `veiculos` (
  `placa` char(7) NOT NULL,
  `marca` varchar(15) DEFAULT NULL,
  `modelo` varchar(15) DEFAULT NULL,
  `cor` varchar(15) DEFAULT NULL,
  `ano` int(4) DEFAULT NULL,
  `comb` char(1) DEFAULT NULL,
  `cat` int(1) DEFAULT NULL,
  `status_alocado` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `veiculos`
--

INSERT INTO `veiculos` (`placa`, `marca`, `modelo`, `cor`, `ano`, `comb`, `cat`, `status_alocado`) VALUES
('ABW4007', 'VW', 'Jetta', 'Preto', 2022, 'F', 3, 1),
('ACZ3243', 'VW', 'Fusca', 'Rosa', 1956, 'G', 4, 1),
('ADE3456', 'Chevrolet', 'Camaro', 'Amarelo', 2022, 'G', 4, 1),
('ADW2456', 'VW', 'Gol', 'Vermelho', 2021, 'A', 1, 1),
('ADX1473', 'Ford', 'Ka', 'Branco', 2021, 'A', 1, 1),
('AQW1234', 'Ford', 'Fusion', 'Preto', 2022, 'F', 3, 1),
('AQX3451', 'Porsche', 'Carrera', 'Preto', 2022, 'G', 4, 1),
('AQY2005', 'Chevrolet', 'S10', 'Branco', 2022, 'D', 2, 1),
('ASX3232', 'Ford', 'Ka', 'Marrom', 2022, 'F', 1, 1),
('AVX4003', 'VW', 'Amarok', 'Preto', 2022, 'D', 2, 1),
('AWQ3703', 'Chevrolet', 'Omega', 'Preto', 2022, 'G', 3, 1),
('AWS2365', 'Chevrolet', 'Cruze', 'Azul', 2022, 'F', 3, 1),
('AWV1234', 'Fiat', 'Palio', 'Branco', 2021, 'F', 1, 0),
('AWV1323', 'VW', 'Gol', 'Branco', 2022, 'F', 1, 0),
('AWY4546', 'Fiat', 'Fiorino', 'Branco', 2021, 'A', 2, 1),
('AZX3273', 'VW', 'Fox', 'Azul', 2021, 'F', 1, 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`cod`);

--
-- Índices para tabela `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`cpf`);

--
-- Índices para tabela `combustivel`
--
ALTER TABLE `combustivel`
  ADD PRIMARY KEY (`tipo`);

--
-- Índices para tabela `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`cod`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`matricula`);

--
-- Índices para tabela `os`
--
ALTER TABLE `os`
  ADD PRIMARY KEY (`num_os`),
  ADD KEY `mat_funcio` (`mat_funcio`),
  ADD KEY `placa_veiculo` (`placa_veiculo`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`login`),
  ADD KEY `mat_func` (`mat_func`);

--
-- Índices para tabela `veiculos`
--
ALTER TABLE `veiculos`
  ADD PRIMARY KEY (`placa`);

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `os`
--
ALTER TABLE `os`
  ADD CONSTRAINT `os_ibfk_1` FOREIGN KEY (`mat_funcio`) REFERENCES `funcionario` (`matricula`),
  ADD CONSTRAINT `os_ibfk_2` FOREIGN KEY (`placa_veiculo`) REFERENCES `veiculos` (`placa`);

--
-- Limitadores para a tabela `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`mat_func`) REFERENCES `funcionario` (`matricula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
