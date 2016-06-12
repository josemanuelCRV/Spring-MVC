package com.mvc.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dto.CocheInputDto;
import com.mvc.dto.CocheOutputDto;
import com.mvc.repository.CocheInputsRepositoryAlfa;
import com.mvc.repository.CocheInputsRepositoryAudi;
import com.mvc.repository.CocheInputsRepositoryFord;
import com.mvc.vo.VoCocheInput;
import com.mvc.vo.VoCocheOutput;

@Service
public class CocheInputServices {

	@Autowired
	CocheInputsRepositoryAlfa repositAlfa;

	@Autowired
	CocheInputsRepositoryAudi repositAudi;

	@Autowired
	CocheInputsRepositoryFord repositFord;

	public CocheOutputDto getCarListByMarca(CocheInputDto mCocheInputDto) {

		if ("Alfa".equals(mCocheInputDto.getMarca())) {
			System.out.println("Alfa - Seleccionó : " + mCocheInputDto.getMarca());

			ArrayList<VoCocheOutput> voCocheOutput = repositAlfa.CargarVoAlfa(getVoCocheFromDTO(mCocheInputDto));

			return getDTOcocheOutputFromVO(voCocheOutput);

		} else if ("Audi".equals(mCocheInputDto.getMarca())) {

			System.out.println("Seleccionó " + mCocheInputDto.getMarca());

			// A repository de Audi
			// VoUserOutput userOutputVO =
			// userInputsRepository.CargarVO1(getVoUserInputFromDTO(mUserInputDto));

			ArrayList<VoCocheOutput> voCocheOutput = repositAudi.CargarVoAudi(getVoCocheFromDTO(mCocheInputDto));

			return getDTOcocheOutputFromVO(voCocheOutput);

		} else {

			// A repository de Ford
			// VoUserOutput userOutputVO =
			// userInputsRepository.CargarVO1(getVoUserInputFromDTO(mUserInputDto));

			ArrayList<VoCocheOutput> voCocheOutput = repositFord.CargarVoFord(getVoCocheFromDTO(mCocheInputDto));

			return getDTOcocheOutputFromVO(voCocheOutput);

		}

	}

	// Mapeo de entrada DTO --> VO - para mandarlo al Repository

	private VoCocheInput getVoCocheFromDTO(CocheInputDto mCocheInputDto) {

		VoCocheInput cocheDTOinputToVO = new VoCocheInput();

		cocheDTOinputToVO.setMarca(mCocheInputDto.getMarca());

		return cocheDTOinputToVO;

	}

	// Mapeo de salida: VO --> DTO hacia la vista

	private CocheOutputDto getDTOcocheOutputFromVO(ArrayList<VoCocheOutput> voCocheOutput) {

		CocheOutputDto cocheOutputDTOsalida = new CocheOutputDto();

		cocheOutputDTOsalida.setMarca(voCocheOutput.iterator().next().getMarca());
		cocheOutputDTOsalida.setModelo(voCocheOutput.iterator().next().getModelo());

		return cocheOutputDTOsalida;

	}

}
