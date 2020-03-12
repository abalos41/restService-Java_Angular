import { Superheroe } from "./superheroe";

export class Villano {
  id: number;
  nombreReal: string;
  alias: string;
  fechaNacimiento: Date;
  habilidades: string;
  ciudadOrigen: string;
  ambicion: string;
  numeroLacayos: number;
  personasAsesinadas: number;
  superheroe: Superheroe;
}
