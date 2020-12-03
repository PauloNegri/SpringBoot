import { StringMap } from '@angular/compiler/src/compiler_facade_interface'
import { Tema } from './Tema'

import { Tema } from './Tema'
export class Postagem{
    public id: number
    public titulo: string
    public texto: string
    public data: Date 
    public tema: Tema
}