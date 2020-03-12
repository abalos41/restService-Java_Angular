import { Villano } from "./villano";

export class Superheroe {
  id: number;
  nombreReal: string;
  alias: string;
  habilidades: string;
  ciudadOrigen: string;
  fechaNacimiento: Date;
  historia: string;
  personasSalvadas: number;
  villano: Villano;
}
