import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ActualizarTipoDocumentoComponent } from './actualizar-tipo-documento.component';

describe('ActualizarTipoDocumentoComponent', () => {
  let component: ActualizarTipoDocumentoComponent;
  let fixture: ComponentFixture<ActualizarTipoDocumentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ActualizarTipoDocumentoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ActualizarTipoDocumentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
