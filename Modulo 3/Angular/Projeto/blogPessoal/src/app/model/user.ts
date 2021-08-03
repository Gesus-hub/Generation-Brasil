import { postagem } from "./postagem"

export class user{
    public Id: number
    public nome: String
    public senha: String
    public usuario: string
    public foto: string
    public tipo: string
    public postagem: postagem[]
}