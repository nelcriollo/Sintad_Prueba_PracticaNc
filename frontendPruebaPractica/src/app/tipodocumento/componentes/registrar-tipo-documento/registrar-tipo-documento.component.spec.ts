import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrarTipoDocumentoComponent } from './registrar-tipo-documento.component';

describe('RegistrarTipoDocumentoComponent', () => {
  let component: RegistrarTipoDocumentoComponent;
  let fixture: ComponentFixture<RegistrarTipoDocumentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistrarTipoDocumentoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrarTipoDocumentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
