INSERT INTO users(email, password, first_name, last_name, user_role)
    VALUES  ('admin@gmail.com', 'admin', 'Taras', 'Shevchenko', 'ROLE_ADMIN'),
            ('user@gmail.com', 'user', 'Lesya', 'Ukrainka', 'ROLE_USER');

INSERT INTO manufacturers(name)
    VALUES  ('Vichy'),
            ('Clinique'),
            ('Kerastase'),
            ('Artdeco'),
            ('Bobbi Brown');

INSERT INTO products (name, price, manufacturer_id)
    VALUES  ('Dercos Anti-Dandruff Advanced Action Shampoo',     319.00,     '19d0a8c1-9382-458b-84be-359ebd6cd555'),
            ('Mineral 89 Fortifying And Plumping Daily Booster', 744.55,     '19d0a8c1-9382-458b-84be-359ebd6cd555'),
            ('Liftactiv Supreme Day Normal to Combi Skin',       694.23,     '19d0a8c1-9382-458b-84be-359ebd6cd555'),
            ('Dercos Energising Shampoo',                        267.89,     '19d0a8c1-9382-458b-84be-359ebd6cd555'),
            ('Dercos Aminexil Clinical 5',                       1320.56,    '19d0a8c1-9382-458b-84be-359ebd6cd555'),
            ('Dercos Anti-Dandruff Deep Purifying Shampoo',      364.82,     '19d0a8c1-9382-458b-84be-359ebd6cd555'),
            ('48 Hr Anti-Perspirant Treatment',                  115.63,     '19d0a8c1-9382-458b-84be-359ebd6cd555'),

            ('Blended Face Powder and Brush',                    763.96,     '36d3ecdd-12d3-4d78-bdd0-4884a178145e'),
            ('Happy For Men',                                    707.00,     '36d3ecdd-12d3-4d78-bdd0-4884a178145e'),
            ('High Impact Mascara',                              462.23,     '36d3ecdd-12d3-4d78-bdd0-4884a178145e'),
            ('Anti-Blemish Solutions Liquid Makeup',             583.64,     '36d3ecdd-12d3-4d78-bdd0-4884a178145e'),
            ('Lash Power Mascara Long-Wearing Formula',          492.55,     '36d3ecdd-12d3-4d78-bdd0-4884a178145e'),
            ('Stay-Matte Sheer Pressed Powder Oil-Free',         699.45,     '36d3ecdd-12d3-4d78-bdd0-4884a178145e'),
            ('All About Eyes',                                   863.22,     '36d3ecdd-12d3-4d78-bdd0-4884a178145e'),
            ('High Impact Waterproof Mascara',                   470.02,     '36d3ecdd-12d3-4d78-bdd0-4884a178145e'),

            ('Nutritive 8H Magic Night Serum',                   794.56,     '56cd0cfe-29d3-4d02-a2d7-3d3e0f2af8ee'),
            ('Blond Absolu Masque Cicaextreme',                  1184.55,    '56cd0cfe-29d3-4d02-a2d7-3d3e0f2af8ee'),
            ('Blond Absolu Bain Lumiere Shampoo',                619.66,     '56cd0cfe-29d3-4d02-a2d7-3d3e0f2af8ee'),
            ('Resistance Therapist Serum',                       824.44,     '56cd0cfe-29d3-4d02-a2d7-3d3e0f2af8ee'),
            ('Resistance Therapist Bain',                        494.33,     '56cd0cfe-29d3-4d02-a2d7-3d3e0f2af8ee'),
            ('Genesis Hydra-Fortifiant Shampoo',                 577.89,     '56cd0cfe-29d3-4d02-a2d7-3d3e0f2af8ee'),

            ('Eyeshadow Base',                                   145.62,     '95b167c1-f770-4daa-9577-579297940fe2'),
            ('Hydra Lip Booster',                                187.00,     '95b167c1-f770-4daa-9577-579297940fe2'),
            ('Soft Eye Liner Waterproof',                        118.05,     '95b167c1-f770-4daa-9577-579297940fe2'),

            ('Highlighting Powder',                              782.23,     'e20e06ae-486f-4775-b777-149d2d968733'),
            ('Luxe Lip Color',                                   505.00,     'e20e06ae-486f-4775-b777-149d2d968733'),
            ('Skin Long-Wear Weightless Foundation SPF15',       795.00,     'e20e06ae-486f-4775-b777-149d2d968733'),
            ('Perfectly Defined Long-Wear Brow Pencil',          795.06,     'e20e06ae-486f-4775-b777-149d2d968733'),
            ('Smokey Eye Mascara 6ml',                           699.55,     'e20e06ae-486f-4775-b777-149d2d968733'),
            ('Long-Wear Cream Shadow Stick',                     604.23,     'e20e06ae-486f-4775-b777-149d2d968733'),
            ('Natural Brow Shaper',                              649.63,     'e20e06ae-486f-4775-b777-149d2d968733'),
            ('Crushed Lip Color',                                477.84,     'e20e06ae-486f-4775-b777-149d2d968733');