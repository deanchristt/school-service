-- Menyisipkan data untuk sekolah
INSERT INTO School (name, school_type) VALUES
                                           ('Sekolah A', 'SD'),
                                           ('Sekolah B', 'SMP'),
                                           ('Sekolah C', 'SMA');

-- Menyisipkan data untuk kelas
INSERT INTO Class (class_name, class_type, school_id) VALUES
                                                          ('Kelas 1A', 'IPA', 1),
                                                          ('Kelas 1B', 'IPS', 1),
                                                          ('Kelas 2A', 'IPS', 2),
                                                          ('Kelas 2B', 'BAHASA', 2),
                                                          ('Kelas 3A', 'IPA', 3),
                                                          ('Kelas 3B', 'IPS', 3);
