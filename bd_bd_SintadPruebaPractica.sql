
-- primero crear la bd, luego ejecutar el api, y despues los insert--

drop database bd_SintadPruebaPractica;
create database bd_SintadPruebaPractica;
use bd_SintadPruebaPractica;

-- ----------------------------
--  tb_usuario
-- ----------------------------
-- - el passwor es  123
INSERT INTO `tb_usuario` VALUES ('1', '1', 'ncriollo', 'Nelson', '$2a$10$4CDXbOQDfjToSun6ZOjbKOUuwQrc9mPEssJcujMsqhXD3FW1oYhQy');

INSERT INTO `tb_entidad` VALUES ('1', 'Jr. Comandante Jimenez Nro. 166 Int. a (entre Cuadra 7 y 8 Javier Padro Oeste)', '1', 'SYL CARGO NOMBRE COMERCIAL', '20505327552', 'SYL S.A.C', '79845612', '1', '1', '1');
INSERT INTO `tb_entidad` VALUES ('2', '3', '1', 'PUNTUAL EXPRESS S.A.C.', '20543844838', 'MZA. F LOTE. 29 AS.RSD.MONTECARLO II LIMA - LIMA - SAN MARTIN DE PORRE', '1', '1', '1', '1');
INSERT INTO `tb_entidad` VALUES ('3', '3', '3', 'ALVAREZ MACHUCA RENZO GUSTAVO', '10410192999', 'AV. LOS ALISOS MZA. G LOTE. 05 ASC. LA ALBORADA DE OQUENDO III ETAPA (CRUCE PTE OQUENDO CON AV.NESTOR GAMBETTA) PROV. CONST. DEL CALLAO - PROV. CONST. DEL CALLAO - CALLAO', '3', '1', '1', '1');
INSERT INTO `tb_entidad` VALUES ('4', '3', '2', 'CARNICOS MAFER S.A.C.', '20600131037', 'CAL.EL UNIVERSO NRO. 327 URB. LA CAMPIÑA ZONA CINCO (ALTURA', '2', '1', '1', '1');
INSERT INTO `tb_entidad` VALUES ('5', '3', '2', 'SUMAQUINARIA S.A.C.', '20556528218', 'AV. M.SUCRE NRO. 455 DPTO. 603 LIMA - LIMA - MAGDALENA DEL MAR', '2', '1', '1', '1');
INSERT INTO `tb_entidad` VALUES ('6', '3', '2', 'OASIS FOODS S.A.C.', '20545412528', 'CAL. FRANCISCO MASIAS NRO. 370 URB. SAN EUGENIO (PISO 7) LIM', '2', '1', '1', '1');
INSERT INTO `tb_entidad` VALUES ('7', '3', '2', 'INVERSIONES PRO3 SAC', '20510620195', 'AV. AUTOPIDTA RAMIRO PRIALE LOTE. 02 A.V. PROP HUERTOS DE HU', '2', '1', '1', '1');
INSERT INTO `tb_entidad` VALUES ('8', '3', '2', 'REPUESTOS DAVID DIESEL E.I.R.L.', '20498383361', 'CAR.VIA EVITAMIENTO MZA. 857 LOTE. 7 SEC. IRRIGACION EL CURAL 1 AREQUIPA - AREQUIPA - CERRO COLORADO', '2', '1', '1', '1');
INSERT INTO `tb_entidad` VALUES ('9', '4', '4', 'ANHUI HAYVO PROTECTIVE PRODUCT MANUFACTURING CO.,LTD', 'CNAH00003', '173 FENGLE AVENUE,ECNOMIC DEVELOPMENT ZONE,QUANJIAO COUNTY', '4', '1', '1', '1');


-- ----------------------------
-- Records of tb_tipo_contribuyente
-- ----------------------------
INSERT INTO `tb_tipo_contribuyente` VALUES ('1', '1', 'Natural Sin Negocio');
INSERT INTO `tb_tipo_contribuyente` VALUES ('2', '1', 'Juridica');
INSERT INTO `tb_tipo_contribuyente` VALUES ('3', '1', 'Natural Con Negocio');
INSERT INTO `tb_tipo_contribuyente` VALUES ('4', '1', 'No Domiciliado');

-- ----------------------------
-- Records of tb_tipo_documento
-- ----------------------------


INSERT INTO `tb_tipo_documento` VALUES ('1', '4', 'CARNET DE EXTRANJERIA', '1','CARNET DE EXTRANJERIA');
INSERT INTO `tb_tipo_documento` VALUES ('2', '7', 'PASAPORTE', '1', 'PASAPORTE');
INSERT INTO `tb_tipo_documento` VALUES ('3', '11', 'PARTIDA DE NACIMIENTO - IDENTIDAD', '1', 'PARTIDA DE NACIMIENTO - IDENTIDAD');
INSERT INTO `tb_tipo_documento` VALUES ('4', '99', 'OTROS', '1', 'OTROS');
INSERT INTO `tb_tipo_documento` VALUES ('5', '6', 'RUC', '1', 'REGISTRO UNICO DEL CONTRIBUYENTE');
INSERT INTO `tb_tipo_documento` VALUES ('6', '1', 'DNI', '1', 'DOCUMENTO NACIONAL DE IDENTIDAD');



