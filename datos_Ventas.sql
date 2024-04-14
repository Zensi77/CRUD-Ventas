USE Ventas;

-- Inserts tabla productos
INSERT INTO Productos(nombre, descripcion, PVP) VALUES
('iPhone 13 Pro', 'Smartphone de última generación con pantalla ProMotion y cámara mejorada.', 999.00),
('Samsung Galaxy S21 Ultra', 'Potente dispositivo con pantalla AMOLED de 120Hz y sistema de cámaras versátil.', 1199.99),
('Sony PlayStation 5', 'Consola de veojuegos de próxima generación con capacades de juego impresionantes.', 499.99),
('Microsoft Surface Laptop 4', 'Computadora portátil premium con rendimiento excepcional y diseño elegante.', 1299.00),
('Canon EOS R5', 'Cámara sin espejo de alta resolución con enfoque automático rápo y grabación de veo 8K.', 3899.00),
('Bose QuietComfort 45', 'Auriculares inalámbricos líderes en cancelación de ruo y calad de sono.', 329.95),
('Nintendo Switch OLED', 'Consola híbra con pantalla OLED de 7 pulgadas y controles mejorados.', 349.99),
('Dyson V11 Absolute', 'Aspiradora inalámbrica con potente succión y autonomía extenda.', 599.99),
('Tesla Model 3', 'Automóvil eléctrico con tecnología autopiloto y diseño aerodinámico.', 39990.00),
('Apple Watch Series 7', 'Smartwatch con pantalla más grande, monitoreo avanzado de salud y resistencia al agua.', 399.00),
('GoPro Hero 10 Black', 'Cámara de acción con veo 5.3K, estabilización HyperSmooth y resistencia al agua.', 449.99),
('Oculus Quest 2', 'Visor de realad virtual todo en uno con seguimiento de manos y gráficos mejorados.', 299.00),
('Amazon Echo Dot (4th Gen)', 'Altavoz inteligente con asistente virtual Alexa y sono mejorado.', 49.99),
('Google Pixel 6 Pro', 'Teléfono inteligente con cámara avanzada, pantalla flua y rendimiento potente.', 899.00),
('MacBook Pro 14-inch', 'Computadora portátil con chip M1 Pro, pantalla Retina XDR y batería de larga duración.', 1999.00),
('DJI Air 2S', 'Drone con cámara de 1 pulgada, modo SmartPhoto y tecnología de transmisión OcuSync 3.0.', 999.00),
('Fitbit Charge 5', 'Banda de fitness con monitoreo avanzado del sueño, GPS integrado y pantalla AMOLED.', 179.95),
('LG OLED C1 TV', 'Televisor OLED con resolución 4K, Dolby Vision IQ y sistema operativo webOS.', 1999.99),
('Sonos Roam', 'Altavoz portátil resistente al agua con sono envolvente y conexión WiFi/Bluetooth.', 169.00),
('Nikon Z6 II', 'Cámara sin espejo con sensor CMOS de 24.5 MP, enfoque automático híbro y estabilización de imagen.', 1996.95),
('Sony WH-1000XM4', 'Auriculares inalámbricos con cancelación de ruo adaptativa y sono de alta resolución.', 348.00),
('Xbox Series X', 'Consola de veojuegos de próxima generación con capacad de juego 4K y ray tracing.', 499.99),
('Apple MacBook Air M1', 'Computadora portátil delgada y ligera con chip M1 de Apple y batería de larga duración.', 999.00),
('Samsung QN90A 4K TV', 'Televisor QLED con resolución 4K, tecnología de retroiluminación LED y Alexa integrado.', 1797.99),
('Fitbit Versa 3', 'Reloj inteligente con GPS integrado, monitoreo continuo de la frecuencia cardíaca y más de 20 modos de ejercicio.', 229.95),
('Razer BlackWow V3', 'Teclado mecánico para juegos con switches Razer Green y retroiluminación RGB personalizable.', 139.99),
('Dell XPS 13', 'Computadora portátil ultradelgada con pantalla InfinityEdge y procesador Intel Core de 11ª generación.', 999.99),
('LG CX OLED TV', 'Televisor OLED con resolución 4K, procesador α9 Gen 3 y soporte para Dolby Vision y Dolby Atmos.', 1996.99),
('Garmin Fenix 6 Pro', 'Reloj deportivo premium con GPS, monitoreo avanzado de rendimiento y resistencia al agua hasta 100 metros.', 649.99),
('Logitech MX Master 3', 'Ratón inalámbrico avanzado con seguimiento Darkfield de alta precisión y rueda de desplazamiento electromagnético.', 99.99),
('Canon EOS R6', 'Cámara sin espejo con sensor CMOS de 20.1 MP, estabilización de imagen de 5 ejes y grabación de veo 4K.', 2499.00),
('Breville Barista Express', 'Máquina de espresso semiautomática con molinillo integrado y control de temperatura precisa.', 699.95),
('Nintendo Switch Lite', 'Consola de juegos portátil con controles integrados y diseño compacto.', 199.99),
('Apple iPad Pro 12.9-inch', 'Tableta con pantalla Liqu Retina XDR, chip M1 de Apple y compatibilad con el Apple Pencil.', 1099.00),
('Samsung Odyssey G7', 'Monitor gaming curvo de 27 pulgadas con resolución QHD y frecuencia de actualización de 240Hz.', 799.99),
('Bose SoundLink Revolve+', 'Altavoz Bluetooth portátil con sono de 360 grados y hasta 17 horas de reproducción.', 299.00),
('Lenovo Legion 7', 'Portátil para juegos con pantalla de 15.6 pulgadas, procesador AMD Ryzen 9 y gráficos NVIA GeForce RTX 3080.', 1999.99),
('Sony WH-CH710N', 'Auriculares inalámbricos con cancelación de ruo digital y hasta 35 horas de reproducción.', 198.00),
('DJI Mini 2', 'Dron ultraligero con cámara de 4K y transmisión en directo HD.', 449.00),
('Apple AirPods Pro', 'Auriculares inalámbricos con cancelación de ruo activa y resistencia al agua y al sudor.', 249.00),
('Microsoft Surface Pro 7', 'Tableta con procesador Intel Core de décima generación y hasta 10.5 horas de duración de la batería.', 749.99),
('Sony X900H 4K TV', 'Televisor LED con resolución 4K, procesador X1 y compatibilad con Dolby Vision y Dolby Atmos.', 999.99),
('Bose Noise Cancelling Headphones 700', 'Auriculares inalámbricos con cancelación de ruo ajustable y hasta 20 horas de autonomía.', 379.00),
('Ring Veo Doorbell Pro 2', 'Timbre de vídeo con resolución 1536p y detección de movimiento avanzada.', 249.99),
('Samsung Galaxy Tab S7+', 'Tableta con pantalla Super AMOLED de 12.4 pulgadas, S Pen incluo y hasta 14 horas de duración de la batería.', 849.99),
('GoPro HERO9 Black', 'Cámara de acción con veo 5K, fotos de 20 MP y estabilización HyperSmooth 3.0.', 449.99),
('Anker Soundcore Liberty Air 2 Pro', 'Auriculares inalámbricos con cancelación de ruo personalizable y hasta 26 horas de autonomía.', 129.99),
('NVIA GeForce RTX 3080', 'Tarjeta gráfica con arquitectura Ampere, ray tracing en tiempo real y hasta 10 GB de memoria GDDR6X.', 699.00),
('Samsung Galaxy Watch 4', 'Reloj inteligente con seguimiento avanzado del sueño, monitorización de la frecuencia cardíaca y detección de caídas.', 249.99),
('Canon EOS 90D', 'Cámara réflex digital con sensor CMOS de 32.5 MP y grabación de veo 4K.', 1199.00),
('Apple Magic Keyboard', 'Teclado inalámbrico con trackpad integrado para usar con iPad Pro.', 299.00),
('Logitech G Pro X Superlight', 'Ratón gaming ultraligero con sensor HERO y hasta 70 horas de autonomía.', 149.99),
('Amazon Fire TV Stick 4K', 'Dispositivo de transmisión con soporte para resolución 4K y control remoto por voz.', 49.99),
('Sonos Beam', 'Barra de sono compacta con soporte para Dolby Atmos y control de voz.', 399.00),
('HP Spectre x360', 'Portátil convertible con pantalla táctil OLED de 13.3 pulgadas y procesador Intel Core de 11ª generación.', 1149.99),
('JBL Charge 5', 'Altavoz portátil con sono JBL Pro y hasta 20 horas de reproducción.', 179.95),
('ASUS ROG Strix Scar 15', 'Portátil gaming con pantalla de 15.6 pulgadas, procesador Ryzen 9 y NVIA RTX 3080.', 2799.99),
('Sony WH-1000XM4', 'Auriculares inalámbricos con cancelación de ruo adaptativa y sono de alta resolución.', 348.00),
('Xbox Series X', 'Consola de veojuegos de próxima generación con capacad de juego 4K y ray tracing.', 499.99),
('Apple MacBook Air M1', 'Computadora portátil delgada y ligera con chip M1 de Apple y batería de larga duración.', 999.00),
('Samsung QN90A 4K TV', 'Televisor QLED con resolución 4K, tecnología de retroiluminación LED y Alexa integrado.', 1797.99),
('Fitbit Versa 3', 'Reloj inteligente con GPS integrado, monitoreo continuo de la frecuencia cardíaca y más de 20 modos de ejercicio.', 229.95),
('Razer BlackWow V3', 'Teclado mecánico para juegos con switches Razer Green y retroiluminación RGB personalizable.', 139.99),
('Dell XPS 13', 'Computadora portátil ultradelgada con pantalla InfinityEdge y procesador Intel Core de 11ª generación.', 999.99),
('LG CX OLED TV', 'Televisor OLED con resolución 4K, procesador α9 Gen 3 y soporte para Dolby Vision y Dolby Atmos.', 1996.99),
('Garmin Fenix 6 Pro', 'Reloj deportivo premium con GPS, monitoreo avanzado de rendimiento y resistencia al agua hasta 100 metros.', 649.99),
('Logitech MX Master 3', 'Ratón inalámbrico avanzado con seguimiento Darkfield de alta precisión y rueda de desplazamiento electromagnético.', 99.99),
('Canon EOS R6', 'Cámara sin espejo con sensor CMOS de 20.1 MP, estabilización de imagen de 5 ejes y grabación de veo 4K.', 2499.00),
('Breville Barista Express', 'Máquina de espresso semiautomática con molinillo integrado y control de temperatura precisa.', 699.95),
('Nintendo Switch Lite', 'Consola de juegos portátil con controles integrados y diseño compacto.', 199.99),
('Apple iPad Pro 12.9-inch', 'Tableta con pantalla Liqu Retina XDR, chip M1 de Apple y compatibilad con el Apple Pencil.', 1099.00),
('Samsung Odyssey G7', 'Monitor gaming curvo de 27 pulgadas con resolución QHD y frecuencia de actualización de 240Hz.', 799.99),
('Bose SoundLink Revolve+', 'Altavoz Bluetooth portátil con sono de 360 grados y hasta 17 horas de reproducción.', 299.00),
('Lenovo Legion 7', 'Portátil para juegos con pantalla de 15.6 pulgadas, procesador AMD Ryzen 9 y gráficos NVIA GeForce RTX 3080.', 1999.99),
('Sony WH-CH710N', 'Auriculares inalámbricos con cancelación de ruo digital y hasta 35 horas de reproducción.', 198.00),
('DJI Mini 2', 'Dron ultraligero con cámara de 4K y transmisión en directo HD.', 449.00),
('Apple AirPods Pro', 'Auriculares inalámbricos con cancelación de ruo activa y resistencia al agua y al sudor.', 249.00),
('Microsoft Surface Pro 7', 'Tableta con procesador Intel Core de décima generación y hasta 10.5 horas de duración de la batería.', 749.99),
('Sony X900H 4K TV', 'Televisor LED con resolución 4K, procesador X1 y compatibilad con Dolby Vision y Dolby Atmos.', 999.99),
('Bose Noise Cancelling Headphones 700', 'Auriculares inalámbricos con cancelación de ruo ajustable y hasta 20 horas de autonomía.', 379.00),
('Ring Veo Doorbell Pro 2', 'Timbre de vídeo con resolución 1536p y detección de movimiento avanzada.', 249.99),
('Samsung Galaxy Tab S7+', 'Tableta con pantalla Super AMOLED de 12.4 pulgadas, S Pen incluo y hasta 14 horas de duración de la batería.', 849.99),
('GoPro HERO9 Black', 'Cámara de acción con veo 5K, fotos de 20 MP y estabilización HyperSmooth 3.0.', 449.99),
('Anker Soundcore Liberty Air 2 Pro', 'Auriculares inalámbricos con cancelación de ruo personalizable y hasta 26 horas de autonomía.', 129.99),
('NVIA GeForce RTX 3080', 'Tarjeta gráfica con arquitectura Ampere, ray tracing en tiempo real y hasta 10 GB de memoria GDDR6X.', 699.00),
('Samsung Galaxy Watch 4', 'Reloj inteligente con seguimiento avanzado del sueño, monitorización de la frecuencia cardíaca y detección de caídas.', 249.99),
('Canon EOS 90D', 'Cámara réflex digital con sensor CMOS de 32.5 MP y grabación de veo 4K.', 1199.00),
('Apple Magic Keyboard', 'Teclado inalámbrico con trackpad integrado para usar con iPad Pro.', 299.00),
('Logitech G Pro X Superlight', 'Ratón gaming ultraligero con sensor HERO y hasta 70 horas de autonomía.', 149.99),
('Amazon Fire TV Stick 4K', 'Dispositivo de transmisión con soporte para resolución 4K y control remoto por voz.', 49.99),
('Sonos Beam', 'Barra de sono compacta con soporte para Dolby Atmos y control de voz.', 399.00),
('HP Spectre x360', 'Portátil convertible con pantalla táctil OLED de 13.3 pulgadas y procesador Intel Core de 11ª generación.', 1149.99),
('JBL Charge 5', 'Altavoz portátil con sono JBL Pro y hasta 20 horas de reproducción.', 179.95),
('ASUS ROG Strix Scar 15', 'Portátil gaming con pantalla de 15.6 pulgadas, procesador AMD Ryzen 9 y gráficos NVIA GeForce RTX 3080.', 2799.99),
('Sony A7 III', 'Cámara sin espejo con sensor CMOS de 24.2 MP y grabación de veo 4K.', 1998.00),
('Bose Portable Smart Speaker', 'Altavoz portátil con sono de 360 grados, resistente al agua y compatible con asistentes de voz.', 349.00),
('LG Gram 17', 'Portátil ultraligero con pantalla de 17 pulgadas, procesador Intel Core de décima generación y hasta 19.5 horas de duración de la batería.', 1499.99),
('Samsung Galaxy Buds Pro', 'Auriculares inalámbricos con cancelación de ruo inteligente y hasta 28 horas de reproducción.', 199.99),
('Microsoft Surface Duo', 'Teléfono inteligente con dos pantallas de 5.6 pulgadas, procesador Snapdragon 855 y sistema operativo Andro.', 1399.00),
('Garmin Forerunner 945', 'Reloj GPS multeporte con seguimiento avanzado de la frecuencia cardíaca y hasta 2 semanas de duración de la batería.', 599.99),
('Apple TV 4K', 'Dispositivo de transmisión con soporte para resolución 4K HDR y Dolby Atmos.', 179.00),
('Sony X800H 4K TV', 'Televisor LED con resolución 4K, procesador X1 y tecnología de mejora de la realad.', 799.99),
('Google Nest Hub Max', 'Pantalla inteligente con cámara Nest integrada y control por voz.', 229.00),
('DJI Mavic Air 2', 'Dron plegable con cámara de 48 MP y capacad de grabación de veo 4K.', 799.00),
('Samsung Galaxy Book Pro 360', 'Portátil convertible con pantalla táctil AMOLED de 15.6 pulgadas y procesador Intel Core de 11ª generación.', 1299.99),
('GoPro MAX', 'Cámara de acción con veo esférico de 360 grados y estabilización Max HyperSmooth.', 499.99),
('Beats Studio Buds', 'Auriculares inalámbricos con cancelación de ruo activa y hasta 8 horas de reproducción.', 149.99),
('Acer Predator Helios 300', 'Portátil gaming con pantalla de 15.6 pulgadas, procesador Intel Core i7 y gráficos NVIA GeForce RTX 3060.', 1299.99),
('Nest Learning Thermostat', 'Termostato inteligente con programación automática y control remoto.', 249.00),
('Razer Blade 15', 'Portátil gaming con pantalla Full HD de 15.6 pulgadas, procesador Intel Core i7 y gráficos NVIA GeForce RTX 3070.', 1799.99),
('Jabra Elite 85t', 'Auriculares inalámbricos con cancelación de ruo ajustable y hasta 25 horas de autonomía.', 229.99),
('ASUS ROG Swift PG279Q', 'Monitor gaming de 27 pulgadas con resolución WQHD y frecuencia de actualización de 165Hz.', 699.00),
('Nokia 8.3 5G', 'Teléfono inteligente con pantalla PureDisplay de 6.81 pulgadas y cámara cuádruple ZEISS.', 699.00),
('Apple AirTag', 'Dispositivo de seguimiento con tecnología Ultra Weband y compatibilad con la app Buscar.', 29.00),
('Epson EcoTank ET-4760', 'Impresora multifunción con depósitos de tinta recargables y capacad de impresión a color.', 499.99),
('Sony WF-1000XM4', 'Auriculares inalámbricos con cancelación de ruo y tecnología de sono espacial.', 278.00),
('Lenovo Legion 5 Pro', 'Portátil gaming con pantalla de 16 pulgadas, procesador AMD Ryzen 7 y gráficos NVIA GeForce RTX 3060.', 1249.99),
('Ring Floodlight Cam Wired Pro', 'Cámara de segurad con foco LED y detección de movimiento avanzada.', 249.99),
('OnePlus 9 Pro', 'Teléfono inteligente con pantalla Flu AMOLED de 6.7 pulgadas y cámara Hasselblad.', 1069.00),
('Amazon Kindle Oasis', 'E-reader resistente al agua con pantalla de 7 pulgadas y ajuste de temperatura de luz cála.', 249.99),
('Corsair K95 RGB Platinum XT', 'Teclado mecánico para juegos con switches Cherry MX Speed y retroiluminación RGB.', 199.99),
('TP-Link Archer AX6000', 'Router Wi-Fi 6 con velocad de hasta 6 Gbps y cobertura para toda la casa.', 299.99),
('Samsung Galaxy A52 5G', 'Teléfono inteligente con pantalla Super AMOLED de 6.5 pulgadas y cámara cuádruple.', 499.99),
('Bowers & Wilkins PX7', 'Auriculares inalámbricos con cancelación de ruo adaptativa y hasta 30 horas de reproducción.', 399.99),
('HP Envy 13', 'Portátil ultradelgado con pantalla Full HD de 13.3 pulgadas y procesador Intel Core i5.', 749.99),
('Anker PowerCore Essential 20000 PD', 'Batería externa de 20000 mAh con tecnología Power Delivery y carga rápa.', 49.99),
('Xiaomi Mi Smart Band 6', 'Banda de fitness con pantalla AMOLED de 1.56 pulgadas y monitorización del sueño.', 44.99),
('Roku Streaming Stick+', 'Dispositivo de transmisión con soporte para resolución 4K HDR y control remoto por voz.', 49.99),
('Dell UltraSharp U2720Q', 'Monitor 4K de 27 pulgadas con tecnología InfinityEdge y compatibilad con USB-C.', 619.99),
('Huawei MateBook X Pro', 'Portátil ultradelgado con pantalla táctil de 13.9 pulgadas y procesador Intel Core i7.', 1399.99),
('SteelSeries Arctis Pro Wireless', 'Auriculares gaming inalámbricos con audio de alta resolución y micrófono con cancelación de ruo.', 329.99),
('Ubiquiti UniFi Dream Machine', 'Router Wi-Fi 6 con controlador de red integrado y protección avanzada.', 299.00),
('Garmin Instinct Solar', 'Reloj GPS resistente con carga solar, seguimiento de activades y hasta 38 horas de duración de la batería.', 399.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('iPhone 13 Pro', 'Teléfono inteligente con pantalla Super Retina XDR de 6.1 pulgadas, chip A15 Bionic y sistema de cámara Pro.', 999.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Samsung Galaxy S21 Ultra', 'Teléfono inteligente con pantalla Dynamic AMOLED 2X de 6.8 pulgadas, procesador Exynos 2100 y cámara cuádruple de 108 MP.', 1199.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Sony PlayStation 5', 'Consola de veojuegos de nueva generación con capacad de hasta 8K, SSD ultra rápo y retrocompatibilad con juegos de PS4.', 499.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('MacBook Pro 16-inch', 'Portátil con pantalla Retina de 16 pulgadas, procesador Intel Core i9 de 8 núcleos y hasta 64 GB de memoria RAM.', 2399.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Canon EOS R5', 'Cámara sin espejo con sensor CMOS de 45 MP, grabación de veo 8K y estabilización de imagen de hasta 8 pasos.', 3899.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Bose Noise Cancelling Headphones 700', 'Auriculares inalámbricos con cancelación de ruo ajustable, hasta 20 horas de duración de la batería y asistente de voz integrado.', 379.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('LG OLED C1 Series', 'Televisor OLED con resolución 4K, procesador α9 Gen4 AI y Dolby Vision IQ.', 1599.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Dell XPS 15', 'Portátil ultradelgado con pantalla InfinityEdge de 15.6 pulgadas, procesador Intel Core i7 de 11ª generación y gráficos NVIA GeForce RTX 3050.', 1899.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Nikon Z6 II', 'Cámara sin espejo con sensor CMOS de 24.5 MP, sistema de enfoque automático de detección de fase y grabación de veo 4K.', 1996.95);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('GoPro HERO10 Black', 'Cámara de acción con veo 5.3K y fotos de 23 MP, estabilización HyperSmooth 4.0 y pantalla táctil trasera.', 499.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Apple Watch Series 7', 'Reloj inteligente con pantalla Retina siempre activa, seguimiento avanzado de la activad y resistencia al agua.', 399.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Samsung Odyssey G9', 'Monitor de gaming curvo ultrapanorámico de 49 pulgadas, resolución Dual QHD y frecuencia de actualización de 240 Hz.', 1499.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Microsoft Surface Laptop Studio', 'Portátil con pantalla PixelSense de 14.4 pulgadas, procesador Intel Core i7 y gráficos NVIA GeForce RTX 3050 Ti.', 1599.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Fujifilm X-T4', 'Cámara sin espejo con sensor CMOS de 26.1 MP, estabilización de imagen de 6.5 pasos y grabación de veo 4K.', 1699.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Sonos Beam', 'Barra de sono compacta con compatibilad Dolby Atmos, control por voz y conectivad HDMI ARC.', 399.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Asus ROG Strix Scar 17', 'Portátil gaming con pantalla de 17.3 pulgadas, procesador AMD Ryzen 9 y gráficos NVIA GeForce RTX 3080.', 2799.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Canon EOS R6', 'Cámara sin espejo con sensor CMOS de 20.1 MP, estabilización de imagen de 8 pasos y grabación de veo 4K.', 2499.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Bowers & Wilkins Formation Wedge', 'Altavoz inalámbrico con sono de alta resolución, tecnología de formación de matriz y diseño único en forma de cuña.', 899.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Lenovo Legion 7i', 'Portátil gaming con pantalla de 15.6 pulgadas, procesador Intel Core i9 y gráficos NVIA GeForce RTX 3080.', 2999.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Amazon Echo Show 15', 'Pantalla inteligente de 15.6 pulgadas con detección de movimiento y seguimiento automático.', 249.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Panasonic Lumix GH5 II', 'Cámara sin espejo con sensor MOS de 20.3 MP, estabilizador de imagen de 6.5 pasos y grabación de veo 4K.', 1699.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Sony WH-1000XM4', 'Auriculares inalámbricos con cancelación de ruo adaptativa, hasta 30 horas de duración de la batería y calad de audio premium.', 349.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('LG Gram 16', 'Portátil ultraligero con pantalla de 16 pulgadas, procesador Intel Core de 11ª generación y hasta 22.5 horas de duración de la batería.', 1299.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('DJI Air 2S', 'Dron plegable con cámara de 1 pulgada de 20 MP, grabación de veo 5.4K y sistema de detección de obstáculos.', 999.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Apple iPad Pro (2021)', 'Tableta con pantalla Liqu Retina XDR de 12.9 pulgadas, chip M1 de Apple y compatibilad con Apple Pencil.', 1099.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Razer Blade 15', 'Portátil gaming con pantalla Full HD de 15.6 pulgadas, procesador Intel Core i7 y gráficos NVIA GeForce RTX 3070.', 2199.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Garmin Fenix 6 Pro', 'Reloj deportivo GPS con sensor de frecuencia cardíaca, mapas topográficos y hasta 14 días de duración de la batería.', 699.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Microsoft Xbox Series X', 'Consola de veojuegos de nueva generación con capacad de hasta 4K, SSD ultra rápo y compatibilad con juegos de Xbox One.', 499.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Bose QuietComfort Earbuds', 'Auriculares inalámbricos con cancelación de ruo ajustable, hasta 6 horas de duración de la batería y resistencia al sudor y al agua.', 279.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Alienware Aurora R12', 'Computadora de escritorio gaming con procesador Intel Core i9, hasta 64 GB de RAM y tarjeta gráfica NVIA GeForce RTX 3080.', 2699.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Nvia GeForce RTX 3090', 'Tarjeta gráfica de alto rendimiento con 24 GB de memoria GDDR6X y arquitectura Ampere.', 1499.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Bowers & Wilkins PX7 Carbon Edition', 'Auriculares inalámbricos con cancelación de ruo adaptativa, hasta 30 horas de duración de la batería y calad de audio premium.', 399.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Sony A7 III', 'Cámara sin espejo con sensor CMOS de 24.2 MP, estabilización de imagen de 5 ejes y grabación de veo 4K HDR.', 1998.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Logitech MX Master 3', 'Ratón inalámbrico avanzado con seguimiento Darkfield de alta precisión y hasta 70 días de duración de la batería.', 99.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Xiaomi Mi 11 Ultra', 'Teléfono inteligente con pantalla AMOLED de 6.81 pulgadas, procesador Snapdragon 888 y cámara principal de 50 MP.', 1199.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Apple AirPods Max', 'Auriculares inalámbricos con sono de alta felad, cancelación de ruo activa y diseño de diadema telescópica.', 549.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Acer Predator Helios 300', 'Portátil gaming con pantalla Full HD de 15.6 pulgadas, procesador Intel Core i7 y gráficos NVIA GeForce RTX 3060.', 1299.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Garmin Forerunner 945', 'Reloj deportivo GPS con monitor de frecuencia cardíaca, mapas a todo color y hasta 2 semanas de autonomía.', 599.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Dell UltraSharp U2720Q', 'Monitor LED de 27 pulgadas con resolución 4K, certificación VESA DisplayHDR 400 y conectivad USB-C.', 619.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('AMD Ryzen 9 5900X', 'Procesador de 12 núcleos y 24 hilos con velocad de reloj de hasta 4.8 GHz y tecnología de proceso de 7 nm.', 549.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Samsung Galaxy Tab S7+', 'Tableta con pantalla Super AMOLED de 12.4 pulgadas, S Pen incluo y hasta 14 horas de duración de la batería.', 849.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('SteelSeries Arctis Pro Wireless', 'Auriculares gaming inalámbricos con sono Hi-Res, transmisor OLED y hasta 20 horas de duración de la batería.', 329.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Razer BlackWow V3 Pro', 'Teclado mecánico gaming inalámbrico con interruptores verdes, iluminación RGB y hasta 200 horas de duración de la batería.', 229.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Huawei MateBook X Pro', 'Portátil ultradelgado con pantalla táctil 3K de 13.9 pulgadas, procesador Intel Core i7 y gráficos NVIA GeForce MX250.', 1499.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('GoPro HERO9 Black', 'Cámara de acción con veo 5K y fotos de 20 MP, estabilización HyperSmooth 3.0 y pantalla frontal LCD.', 449.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Sony WH-1000XM3', 'Auriculares inalámbricos con cancelación de ruo adaptativa, hasta 30 horas de duración de la batería y calad de audio premium.', 349.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Lenovo Legion Y740', 'Portátil gaming con pantalla Full HD de 15.6 pulgadas, procesador Intel Core i7 y gráficos NVIA GeForce RTX 2060.', 1399.99);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Asus ROG Swift PG279Q', 'Monitor gaming IPS de 27 pulgadas con resolución WQHD, frecuencia de actualización de 165 Hz y tecnología G-SYNC.', 699.00);
INSERT INTO Productos(nombre, descripcion, PVP) VALUES ('Xbox Elite Wireless Controller Series 2', 'Controlador inalámbrico personalizable con hasta 40 horas de duración de la batería y gatillos de ajuste.', 179.99);






-- INSERTs para la tabla de clientes
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('María', 'González', 'Martínez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Antonio', 'Rodríguez', 'García');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Carmen', 'Hernández', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('José', 'Martínez', 'González');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Ana', 'Pérez', 'Sánchez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Francisco', 'Gómez', 'Martín');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Isabel', 'Sánchez', 'Díaz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Manuel', 'López', 'Pérez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Laura', 'García', 'Martínez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('David', 'Fernández', 'Sánchez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Marta', 'Martínez', 'Gómez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Daniel', 'Ruiz', 'Hernández');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Sara', 'Díaz', 'Moreno');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Javier', 'Álvarez', 'Fernández');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Lucía', 'Torres', 'Jiménez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Pablo', 'Flores', 'Gutiérrez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Elena', 'Dominguez', 'Muñoz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Alejandro', 'Vázquez', 'Ortega');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Cristina', 'Cabrera', 'Serrano');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Diego', 'Reyes', 'Gómez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Rosa', 'Iglesias', 'Marín');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Adrián', 'Molina', 'Santiago');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Patricia', 'Romero', 'Rojas');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Rubén', 'Pascual', 'Navarro');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Inés', 'Vidal', 'Garrido');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Álvaro', 'Santos', 'Barrios');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Nuria', 'Cortés', 'Giménez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Carlos', 'Garrido', 'Delgado');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Sofía', 'Castillo', 'Ortiz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Jaime', 'Lozano', 'Sanz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Rocío', 'Ortega', 'Blanco');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Iván', 'Montero', 'Cano');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Silvia', 'Herrero', 'Prieto');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Juan', 'Guerrero', 'Gómez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Ana Belén', 'Salgado', 'Muñoz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Mario', 'Vega', 'Ruiz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Lorena', 'Jiménez', 'Molina');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Alberto', 'Calvo', 'Sanz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Marina', 'Ferrer', 'Crespo');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Pedro', 'Giménez', 'Ramos');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Celia', 'Rey', 'Vidal');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Gonzalo', 'Campos', 'Alonso');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Mónica', 'Parra', 'Carmona');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Hugo', 'Méndez', 'Moya');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Alicia', 'Vargas', 'Arias');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Luis', 'Ortega', 'Sanz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Natalia', 'Ibáñez', 'Vázquez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Iker', 'Prieto', 'Fernández');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Sandra', 'Pérez', 'Hernández');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Juan José', 'León', 'Navarro');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Eva', 'Vega', 'Romero');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Jorge', 'Fuentes', 'Gallardo');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Sonia', 'Camacho', 'Valle');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Marcos', 'Sáez', 'Gil');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Ruth', 'Blasco', 'Soler');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Rubén', 'Hidalgo', 'Peña');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Aurora', 'Ramos', 'Carretero');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Roberto', 'Marín', 'Carrasco');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Nerea', 'Pastor', 'Segura');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Oscar', 'Cano', 'Gallardo');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Elena', 'Villalba', 'Ortiz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Carlos', 'Blanco', 'Molina');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Ana María', 'Diez', 'Márquez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Javier', 'Gallardo', 'Serrano');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Alba', 'Garrido', 'Ferrer');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Miguel', 'Segura', 'Vázquez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Raquel', 'Esteban', 'Mora');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Iván', 'Ortega', 'Crespo');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Andrea', 'Navarro', 'González');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Diego', 'Sáez', 'Vidal');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('María José', 'Mateo', 'Ferrer');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Lucas', 'Gutiérrez', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Eva', 'Serrano', 'Molina');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Pablo', 'Cruz', 'Díaz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Cristina', 'Blanco', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Adrián', 'Rivas', 'Gil');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Clara', 'Ortega', 'Martínez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Héctor', 'Vidal', 'González');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Marina', 'Muñoz', 'Fernández');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('José Manuel', 'Sanz', 'Ferrer');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Elena', 'Herrero', 'Ramos');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Marcos', 'Mora', 'Gómez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Carla', 'Fernández', 'García');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Iker', 'González', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Silvia', 'Muñoz', 'Martínez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Óscar', 'Torres', 'Ferrer');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Nuria', 'Gómez', 'Cabrera');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Samuel', 'Sánchez', 'Blanco');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Alba', 'Ramos', 'Sanz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Jorge', 'López', 'Vidal');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Lucía', 'García', 'Muñoz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Ángel', 'Martínez', 'Hernández');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Celia', 'Serrano', 'González');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Daniel', 'Ortega', 'Blanco');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Natalia', 'Gómez', 'Sánchez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('David', 'Ferrer', 'Muñoz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Sofía', 'Hernández', 'García');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Pablo', 'Martínez', 'Blanco');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Carolina', 'Sanz', 'Ramos');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Adrián', 'Gómez', 'Serrano');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Julia', 'Muñoz', 'García');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Laura', 'Martínez', 'González');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Alejandro', 'Fernández', 'Rodríguez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('María', 'Gutiérrez', 'Pérez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Antonio', 'Sánchez', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Carmen', 'Díaz', 'Sanz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Javier', 'Moreno', 'García');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Lucía', 'Romero', 'Martínez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Diego', 'Suárez', 'Torres');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Elena', 'Navarro', 'Ruiz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Manuel', 'Jiménez', 'Hernández');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Sara', 'Pérez', 'Gómez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Francisco', 'Torres', 'Fernández');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Isabel', 'López', 'Martínez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Adrián', 'García', 'González');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Natalia', 'Ruiz', 'Sánchez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Rafael', 'Martínez', 'Díaz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Patricia', 'Sanz', 'Moreno');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Daniel', 'Gómez', 'Romero');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Marina', 'Rodríguez', 'Navarro');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Carlos', 'Hernández', 'Jiménez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Ana', 'Gómez', 'Pérez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Pedro', 'Fernández', 'Torres');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Sandra', 'Martínez', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Miguel', 'González', 'García');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Paula', 'Sánchez', 'Ruiz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Marcos', 'López', 'Martínez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Lucas', 'García', 'Gómez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Silvia', 'Ruiz', 'Sanz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Juan', 'Hernández', 'Díaz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Eva', 'Pérez', 'Moreno');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('David', 'Gómez', 'García');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Marta', 'Sánchez', 'Ruiz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Alejandra', 'Martínez', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Raúl', 'González', 'Sánchez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Nerea', 'Hernández', 'Díaz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Rubén', 'Pérez', 'Moreno');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Cristina', 'López', 'Gómez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Jorge', 'Sanz', 'Ruiz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Sofía', 'García', 'Martínez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Iker', 'Ruiz', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Celia', 'Martínez', 'Gómez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Oscar', 'Sánchez', 'Ruiz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Nuria', 'Gómez', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Carlos', 'Ruiz', 'Martínez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Clara', 'Sánchez', 'Gómez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Marc', 'Martínez', 'Ruiz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Elena', 'Gómez', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Mario', 'Sánchez', 'Martínez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Julia', 'Ruiz', 'Gómez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Diego', 'Martínez', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Ana', 'Sánchez', 'Ruiz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Pablo', 'Gómez', 'Martínez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Sara', 'Ruiz', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Javier', 'Sánchez', 'Martínez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Lorena', 'Gómez', 'Ruiz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Hugo', 'Martínez', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Laura', 'Sánchez', 'Ruiz');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Irene', 'Gómez', 'Martínez');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Alex', 'Ruiz', 'López');
INSERT INTO Clientes(nombre, apellido1, apellido2) VALUES ('Eva', 'Sánchez', 'Martínez');



-- INSERTs adicionales para asignar productos a clientes con cantidades variadas
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (7, 3, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (7, 7, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (7, 12, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (8, 4, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (8, 9, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (8, 15, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (9, 5, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (9, 10, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (9, 16, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (10, 1, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (10, 6, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (10, 11, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (11, 2, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (11, 7, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (11, 12, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (12, 3, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (12, 8, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (12, 13, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (13, 4, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (13, 9, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (13, 14, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (14, 5, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (14, 10, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (14, 15, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (15, 1, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (15, 6, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (15, 11, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (16, 2, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (16, 7, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (16, 12, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (17, 3, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (17, 8, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (17, 13, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (18, 4, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (18, 9, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (18, 14, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (19, 5, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (19, 10, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (19, 15, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (20, 1, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (20, 6, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (20, 11, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (21, 2, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (4, 4, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (4, 9, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (4, 16, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (5, 1, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (5, 6, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (5, 11, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (6, 2, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (6, 8, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (6, 14, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (1, 1, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (1, 5, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (1, 10, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (2, 2, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (2, 7, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (2, 13, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (3, 3, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (3, 8, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (3, 15, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (21, 7, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (21, 12, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (22, 3, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (22, 8, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (22, 13, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (23, 4, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (23, 9, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (23, 14, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (24, 5, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (24, 10, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (24, 15, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (25, 1, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (25, 6, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (25, 11, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (26, 2, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (26, 7, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (26, 12, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (27, 3, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (27, 8, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (27, 13, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (28, 4, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (28, 9, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (28, 14, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (29, 5, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (29, 10, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (29, 15, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (30, 1, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (30, 6, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (30, 11, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (31, 2, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (31, 7, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (31, 12, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (32, 3, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (32, 8, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (32, 13, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (33, 4, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (33, 9, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (33, 14, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (34, 5, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (34, 10, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (34, 15, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (35, 1, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (35, 6, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (35, 11, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (36, 2, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (36, 7, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (36, 12, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (37, 3, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (37, 8, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (37, 13, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (38, 4, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (38, 9, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (38, 14, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (39, 5, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (39, 10, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (39, 15, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (40, 1, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (40, 6, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (40, 11, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (41, 2, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (41, 7, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (41, 12, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (42, 3, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (42, 8, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (42, 13, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (43, 4, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (43, 9, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (43, 14, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (44, 5, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (44, 10, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (44, 15, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (45, 1, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (45, 6, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (45, 11, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (46, 2, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (46, 7, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (46, 12, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (47, 3, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (47, 8, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (47, 13, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (48, 4, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (48, 9, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (48, 14, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (49, 5, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (49, 10, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (49, 15, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (50, 1, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (50, 6, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (50, 11, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (51, 2, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (51, 7, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (51, 12, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (52, 3, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (52, 8, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (52, 13, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (53, 4, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (53, 9, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (53, 14, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (54, 5, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (54, 10, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (54, 15, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (55, 1, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (55, 6, 1);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (55, 11, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (56, 2, 2);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (56, 7, 3);
INSERT INTO Compran(id_cliente, id_producto, cantidad) VALUES (56, 12, 1);