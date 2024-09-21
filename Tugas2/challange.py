print("Welcome To My Program👋")
nama = []
nim = []

def ReadMahasiswa():
    print(nama,nim)


while True :
    pilihan=int(input("What you wanna DO?\n1. Create Mahasiswa\n2. Read Mahasiswa\n3. Update Mahasiswa\n4. Delete Mahasiswa\n5. Exit\nPilihan(1-5) = "))
    match pilihan:
        case 1:
            nama=nama.append(input("Nama\t: "))
            nim=nim.append(int(input("Nim\t: "))
        case 2:
            ReadMahasiswa()
        case 3:
            input("Nim\t: ")
        case 4:
            input("Nim\t :")
        case 5:
            break